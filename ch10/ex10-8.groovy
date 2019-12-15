// 10.8 Calling Methods That Don't Exist (invokeMethod)

class Person{
  String name
  Map relationships = [:]

  Object invokeMethod(String what, Object who){
    if(relationships.containsKey(what)){
      who.each{thisPerson ->
	relationships.get(what).add(thisPerson)
      }
    }
    else{
      relationships.put(what,who as List)
    }
  }
}

def scott = new Person(name:"Scott")
scott.married "Kim"
scott.knows "Neal"
scott.workedWith "Brianp"
scott.knows "Venkat"
scott.workedWith "Jared"
scott.knows "Ted", "Ben", "David"

println scott.relationships
// ===>
// [married:[Kim],
//  knows:[Neal, Venkat, Ted, Ben, David],
//  workedWith:[Brianp, Jared]]
