// 8.3 Creating Hyphenated Element Names

def xml = new groovy.xml.MarkupBuilder()
xml.person(id:99){
  "first-name"("John")
  last_name("Smith")
}

// ===>
// <person id='99'>
//   <first-name>John</first-name>
//   <last_name>Smith</last_name>
// </person>


def xml = new groovy.xml.MarkupBuilder()
xml.person(id:99){
  first-name("John")
  last_name("Smith")
}

// ===>
// ERROR groovy.lang.MissingPropertyException:
// No such property: first for class: groovysh_evaluate
