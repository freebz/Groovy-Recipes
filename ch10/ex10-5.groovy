// 10.5 Checking for the Existence of a Method

class Person{
  String firstname
  String lastname
}
def p = new Person()
if(p.metaClass.respondsTo(p, "getFirstname")){
  println p.getFirstname()
}

p.foo()
// ERROR groovy.lang.MissingMethodException:
//   No signature of method: Person.foo() is applicable for argument types: () values: []


// Groovy 1.0

def list = p.class.methods as List
if(list.contains("getFirstname")){
  p.getFirstname()
}


// Checking for Overloaded Methods

class Greeting{
  def sayHello(){
    println "Hello, Stranger"
  }

  def sayHello(String name){
    println "Hello, ${name}"
  }
}

def g = new Greeting()
if(g.metaClass.respondsTo(g, "sayHello", null)){
  g.sayHello()
}
// ===> Hello, Stranger

if(g.metaClass.respondsTo(g, "sayHello", String)){
  g.sayHello("Jane")
}
// ===> Hello, Jane

println "Number of sayHello() methods: " +
  g.metaClass.respondsTo(g, "sayHello").size()
// ===> Number of sayHello() methods: 2

g.metaClass.respondsTo(g, "sayHello").each{m ->
  println "${m.name} ${m.nativeParameterTypes}"
}
// ===>
// sayHello {class java.lang.String}
// sayHello {}


if(g.metaClass.respondsTo(g, "sayHello", String, String)){
  g.sayHello("Jane", "Doe")
}
