// 7.2 Understanding the Difference Between XmlParser and XmlSlurper

def p = """<person id="99">John Smith</person>"""

// XmlParser (*** different ***)
def person = new XmlParser().parseText(p)
println person.getClass()
// ===> class groovy.util.Node

// XmlSlurper (*** different ***)
person = new XmlSlurper().parseText(p)
println person.getClass()
// ===> class groovy.util.slurpersupport.NodeChild


// Understanding XmlParser

def p = """<person id="100">Jane Doe</person>"""
def person = new XmlParser().parseText(p)

println person.text()
// ===> Jane Doe
println person.attribute("id")
// ===> 100
println person.attribute("foo")
// ===> null


// Unserstanding XmlSlurper

def p = """<person id="100">Jane Doe</person>"""
def person = new XmlSlurper().parseText(p)

println person
// ===> Jane Doe
println person.@id
// ===> 100
println person.@foo
// ===>  (returns an empty string)
