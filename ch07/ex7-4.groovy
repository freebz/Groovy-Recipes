// 7.4 Dealing with XML Attributes

def p = """<person id="99" ssn="55-11-2222">John Smith</person>"""

// XmlParser (*** same ***)
def person = new XmlParser().parseText(p)
println person.attributes()
// ===> ["ssn":"555-11-2222", "id":99"]

person.attributes().each{name, value->
  println "${name} ${value}"
}
// ===>
// ssn 55-11-2222
// id 99

// XmlSlurper (*** same ***)
person = new XmlSlurper().parseText(p)
println person.attributes()
// ===> ["ssn":"555-11-2222", "id":99"]

person.attributes().each{name, value->
  println "${name} ${value}"
}
// ===>
// ssn 55-11-2222
// id 99


// Getting a Single Attribute

def p = """<person id="99" ssn="555-11-2222">John Smith</person>"""

// XmlParser (*** defferent ***)
def person = new XmlParser().parseText(p)
println person.attribute("id")
// ===> 99
println person.attribute("foo")
// ===> null

// XmlSlurper (*** difference ***)
person = new XmlSlurper().parseText(p)
println person.@id
// ===> 99
println person.@foo
// ===> (returns an empty string)


// Using Hashmap Syntax for Attributes

def p = """<person id="99" ssn="555-11-2222">John Smith</person>"""

// XmlParser (*** same ***)
def person = new XmlParser().parseText(p)
print person["@id"]
// ===> 99

def atts = ["id", "ssn"]

atts.each{att->
  println person["@${att}"]
}
// ===>
// 99
// 555-11-2222

// XmlSlurper (*** same ***)
person = new XmlSlurper().parseText(p)
println person["@id"]
// ===> 99

atts.each{att->
  println person["@${att}"]
}
// ===>
// 99
// 555-11-2222
