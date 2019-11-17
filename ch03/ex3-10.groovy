// 3.8 Safe Dereferencing (?)

def s = "Jane"
s.size()
// ===> 5

s = null
s.size()
// Caught: java.lang.NullPointerException: Cannot invoke method size()
//         on null object at CommandLine.run(CommandLine.groovy:2)


//notice that we can call size()
//without throwing a NullPointerException
//thanks to the safe dereferencing ? operator
s?.size()
// ===> null


if(s != null){
  s.doSomething();
}


s?.doSomething()


//in Java:
if(person != null && person.getAddress() != null
          && person.getAddress().getPhoneNumber() != null ){
  System.out.println(person.getAddress().getPhoneNumber());
}
else{
  System.out.println("");
}

//in Groovy:
println person?.address?.phoneNumber
