// 7.10 Populating a GroovyBean from XML

def p = """
<person>
  <firstname>Jane</firstname>
  <lastname>Doe</lastname>
</person>
"""

class Person{
  String firstname
  String lastname
}

def pxml = new XmlParser().parseText(p)
def person = new Person()

pxml.children().each{child ->
  person.setProperty(child.name(), child.text())
}
