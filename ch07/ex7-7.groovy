// 7.7 Dealing with Hyphenated Element Names

//notice the hyphenated and underscored element names
//Groovy has to use special syntax to deal with the hyphens
def p = """
<person id="99">
  <first-name>John</first-name>
  <last_name>Smith</last_name>
</person>
"""

// XmlParser (*** different ***)
def person = new XmlParser().parseText(p)
println person.first-name.text()
// ===>
// ERROR groovy.lang.MissingPropertyException:
// No such property: name for class: groovysh_evaluate

println person.'first-name'.text()
println person['first-name'].text()
// ===>
// John

println person.last_name.text()
println person.'last_name'.text()
println person['last_name'].text()
// ===>
// Smith

// XmlSlurper (*** different ***)
person = new XmlSlurper().parseText(p)
println person.'first-name'
// ===>
// John

println person.last_name
println person.'last_name'
println person['last_name']
// ===>
// Smith
