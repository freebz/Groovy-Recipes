// Iterating

def family = [dad:"John", mom:"Jane"]

//using the default 'it' variable:
family.each{println it}
// ===>
// dad=John
// mom=Jane

//getting the key and value from 'it'
family.each{println "${it.value} is the ${it.key}"}
// ===>
// John is the dad
// Jane is the mom

//using named variables for the key and value
family.each{k,v ->
  println "${v} is the ${k}"
}
// ===>
// John is the dad
// Jane is the mom
