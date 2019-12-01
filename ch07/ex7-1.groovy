// 7.1 The "I'm in a Hurry" Guide to Parsing XML

def p = """<person id="99">John Smith</person>"""
def person = new XmlSlurper().parseText(p)

println person
// ===> John Smith
println person.@id
// ===> 99


def p2 = """
<person id="100">
  <firstname>Jane</firstname>
  <lastname>Doe</lastname>
  <address type="home">
    <street>123 Main St</street>
    <city>Denver</city>
    <state>CO</state>
    <zip>80020</zip>
  </address>
</person>"""

def person = new XmlSlurper().parseText(p2)
println person.firstname
// ===> Jane
println person.address.city
// ===> Denver
println Person.address.@type
// ===> home
