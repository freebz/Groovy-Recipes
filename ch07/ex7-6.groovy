// 7.6 Dealing with Mixed-Cse Element names

// notice the case difference in firstname and LastName
// Groovy code mirrors the case of the XML element name
def p = """
<person id="99">
  <firstname>John</firstname>
  <LastName>Smith</LastName>
</person>
"""

// XmlParser (*** different ***)
def person = new XmlParser().parseText(p)
println person.firstname.text()
// ===> John
println person.LastName.text()
// ===> Smith

// XmlSlurper (*** different ***)
person = new XmlSlurper().parseText(p)
println person.firstname
// ===> John
println person.LastName
// ===> Smith
