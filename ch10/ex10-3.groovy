// 10.3 Checking for the Existence of a Field

class Person{
  String firstname
  String lastname
}
def p = new Person()
if(p.metaClass.hasProperty(p, "firstname")){
  p.firstname = "Jane"
}
println p.firstname
// ===> Jane

p.last = "Doe"
// ERROR groovy.lang.MissingPropertyException:
//   last for class: Person


// Groovy 1.0 Workaround

if(p.properties.containsKey("firstname")){
  p.firstname = "Jane"
}


// When Would You Use This?

// url to test this code:
http://localhost:8080/groovlets/person.groovy?
   firstname=Scott&lastname=Davis&title=Bench+Warmer

// person.groovy
class Person{
  String firstname
  String lastname
  String toString(){"${firstname} ${lastname}"}
}

def person = new Person()

request.parameterMap.each{name, value->
  if(person.metaClass.hasProperty(person, name)){
    person.setProperty(name, value[0])
  }
}

println "QueryString: ${request.queryString}"
println "<br/>"
println "Incoming parameters: ${request.parameterMap}"
println "<br/>"
println "Resulting Person: ${person}"


// person.groovy
class Person{
  String firstname
  String lastname
  String toString(){"${firstname} ${lastname}"}

  MetaProperty hasProperty(String property){
    return this.metaClass.hasProperty(this, property)
  }
}

def person = new Person()

request.parameterMap.each{name, value->
  if(person.hasProperty(name)){
    person.setProperty(name, value[0])
  }
}

println "QueryString: ${request.queryString}"
println "<br/>"
println "Incoming parameters: ${request.parameterMap}"
println "<br/>"
println "Resulting Person: ${person}"
