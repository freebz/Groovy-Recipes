// Iterating with an Index

def languages = ["Java", "Groovy", "JRuby"]
languages.eachWithIndex{lang, i ->
  println "${i}: ${lang}"
}
// ===>
// 0: Java
// 1: Groovy
// 2: JRuby
