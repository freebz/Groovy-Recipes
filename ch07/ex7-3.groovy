// 7.3 Parsing XML Documents

def file = new File("person.xml")
def url = "http://somewhere.org/person.xml"

// XmlParser (*** same ***)
def person = new XmlParser().parse(file)
def person2 = new XmlParser().parse(url)

// XmlSlurper (*** same ***)
person = new XmlSlurper().parse(file)
person2 = new XmlSlurper().parse(url)


// Parsing XML Stirngs

def p = """<person id="99">John Smith</person>"""

// XmlParser (*** same ***)
def person = new XmlParser().parseText(p)

// XmlSlurper (*** same ***)
person = new XmlSlurper().parseText(p)
