// 8.6 Creating Parts of the XML Document Separately

def builder = new groovy.xml.StreamingMarkupBuilder()
def person = {
  person(id:99){
    firstname("John")
    lastname("Smith")
  }
}
println builder.bind(person)
// ===>
// <person id='99'><firstname>John</firstname><lastname>Smith</lastname></person>


def builder = new groovy.xml.StreamingMarkupBuilder()

def person1 = {
  person(id:99){
    firstname("John")
    lastname("Smith")
  }
}

def person2 = {
  person(id:100){
    firstname("Jane")
    lastname("Doe")
  }
}

def personList = {
  "person-list"{
    out << person1
    out << person2
  }
}

println builder.bind(personList)
// ===>
// <person-list>
//   <person id='99'>
//     <firstname>John</firstname><lastname>Smith</lastname>
//   </person>
//   <person id='100'>
//     <firstname>Jane</firstname><lastname>Doe</lastname>
//   </person>
// </person-list>
