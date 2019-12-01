// 7.8 Navigating Deeply Nested XML

def p = """
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

// XmlParser (*** different ***)
def person = new XmlParser().parseText(p)
println person.address[0].street[0].text()
// ===> 123 Main St

// XmlSlurper (*** different ***)
person = new XmlSlurper().parseText(p)
println person.address.street
// ===> 123 Main St


// XmlParser: text(), children(), and value()

def p = """
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

def person = new XmlParser().parseText(p)
println person.text()
// ===> (returns an empty strig)

println person.children()
// ===>
// [
//   firstname[attributes={}; value=[Jane]],
//   lastname[attributes={}; value=[Doe]],
//   address[attributes={type=home}; value=[
//     street[attributes={}; value=[123 Main St]],
//     city[attributes={}; value=[Denver]],
//     state[attributes={}; value=[CO]],
//     zip[attributes={}; value=[80020]]
//   ]]
// ]

println person.value()
// A generic function that returns either text() or value(),
// depending on which field is populated.
// In this case, person.value() is equivalent to children().


if(person.text()){
        println "Leaf"
} else{
        println "Branch"
}
// ===> Branch

if(person.children()){
        println "Branch"
} else{
        println "Leaf"
}
// ===> Branch


// XmlParser: each()

def p = """
<person id="100">
  <firstname>Jane</firstname>
  <lastname>Doe</lastname>
  <address type="home">
    <street>123 Main St</street>
    <city>Denver</city>
    <state>CO</state>
    <zip>80020</zip>
  </address>
  <address type="work">
    <street>987 Other Ave</street>
    <city>Boulder</city>
    <state>CO</state>
    <zip>80090</zip>
  </address>
</person>"""

def person = new XmlParser().parseText(p)

println person.address[0].attribute("type")
// ===> home
println person.address[1].attribute("type")
// ===> work
person.address.each{a->
  println a.attribute("type")
}

// ===>
// home
// work


person.address.each{a->
  println a.city[0].text()
}
person.address.each{a->
  println a.city[0].text()
}
// ===>
// Denver
// Boulder


person.address.city.each{c->
  println c.text()
}
// ===>
// Denver
// Boulder


// XmlSlurper

def p = """
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

def person = new XmlSlurper().parseText(p)
println person.firstname
// ===> Jane
println person.lastname
// ===> Doe
println person.address.city
// ===> Denver


println person
// ===> JaneDoe123 Main StDenverCO80020
println person.address
// ===> 123 Main StDenverCO80020


def p = """
<person id="100">
  <firstname>Jane</firstname>
  <lastname>Doe</lastname>
  <address type="home">
    <street>123 Main St</street>
    <city>Denver</city>
    <state>CO</state>
    <zip>80020</zip>
  </address>
  <address type="work">
    <state>987 Other Ave</state>
    <city>Boulder</city>
    <state>CO</state>
    <zip>80090</zip>
  </address>
</person>"""

def person = new XmlSlurper().parseText(p)
println person.address.city
// ===> DenverBoulder
println person.address[0].city
// ===> Denver


person.address.city.each{println it}
// ===>
// Denver
// Boulder
