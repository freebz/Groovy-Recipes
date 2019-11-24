// Calling Mehtods in Another Script

//hello3.groovy
if(args){
  println "Hello ${args[0]}"
  if(args.size() > 1){
    println "...and your little dog, too: ${args[1]}"
  }
}

def sayHola(){
        println "Hola"
}

//goodbye3.groovy
hello3.main()
hello3.main("Glenda")
hello3.main("Dorothy", "Toto")
println "Goodbye"

h = new hello3()
h.sayHola()
