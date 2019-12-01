// 7.5 Getting the Body of an XML Element

def p = """<person id="100">Jane Doe</person>"""

// XmlParser (*** different ***)
def person = new XmlParser().parseText(p)
println person.text()
// ===> Jane Doe

// XmlSlurper (*** different ***)
person = new XmlSlurper().parseText(p)
println person
// ===> Jane Doe


def p = """<person id="100">Jane Doe</person>"""
def person = new XmlParser().parseText(p)
println person
// ===> person[attributes={id=100}; value=[Jane Doe]]


// Using Hashmap Syntax for Elements

def p = """
<person id="100">
  <firstname>Jane</firstname>
  <lastname>Doe</lastname>
</person>"""

// XmlParser (*** different ***)
def person = new XmlParser().parseText(p)
println person['firstname'].text()
// ===> Jane

// XmlSlurper (*** different ***)
person = new XmlSlurper().parseText(p)
println person['firstname']
// ===> Jane


def xml = """
<person id="100">
  <firstname>Jane</firstname>
  <lastname>Doe</lastname>
</person>
"""

def person = new XmlParser().parseText(xml)
def elements = ["firstname", "lastname"]
elements.each{element->
  println person[element].text()
}
// ===>
// Jane
// Doe
