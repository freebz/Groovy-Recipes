// 7.9 Parsing an XML Document with Namespaces

def p_xml = """
<p:person
    xmlns:p="http://somewhere.org/person"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://somewhere.org/person
                        http://somewhere.org/person.xsd"
    id="99">
  <p:firstname>John</p:firstname>
  <p:last-name>Smith</p:last-name>
</p:person>
"""

def person = new XmlParser().parseText(p_xml)

//the firstname element cannot be found without its namespace
println person.firstname.text()
// ===> []

def p = new groovy.xml.Namespace("http://somewhere.org/person")
println person[p.firstname].text()
// ===> John

println person[p.'last-name'].text()
// ===> Smith


def p = new groovy.xml.Namespace("http://somewhere.org/person")
println person[p.firstname].text()
// ===> John


// Namespaces in XmlSluper

def p = """
<p:person
    xmlns:p="http://somewhere.org/person"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://somewhere.org/person
                        http://somewhere.org/person.xsd"
    id="99">
  <p:firstname>John</p:firstname>
  <p:last-name>Smith</p:last-name>
</p:person>
"""

def person = new XmlSlurper().parseText(p)
println person.firstname
println person.'last-name'
// ===>
// John
// Smith


def itemXml = """
<item
  xmlns:product="urn:somecompany:products"
  xmlns:vendor="urn:somecompany:vendors">
    <product:name>iPhone</product:name>
    <vendor:name>Apple</vendor:name>
    <quantity>1<quantity>
</item>
"""

def item = new XmlSlurper().parseText(itemXml)
println item.name
// ===> iPhoneApple

def ns = [:]
ns.product = "urn:somecompany:products"
ns.vendor = "urn:somecompany:vendors"
item.declareNamespace(ns)

println item.'product:name'
// ===> iPhone
