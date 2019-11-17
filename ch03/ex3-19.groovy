// Iterating

def languages = ["Java", "Groovy", "JRuby"]

//using the default 'it' variable:
languages.each{println it}
// ===>
// Java
// Groovy
// JRuby

//using the named variable of your choice:
languages.each{lang ->
  println lang
}
// ===>
// Java
// Groovy
// JRuby
