// 10.6 Creating a Field Pointer

class Person{
  String name
  String getName(){
    "My name is ${name}"
  }
}

def p = new Person()
p.name = "Jame"
println p.name
// ===> My name is Jame
println p.@name
// ===> Jame
