// 8.5 Understanding the Difference Between markupBuilder and StreamingMarkupBuilder

// MarkupBuilder
def xml = new groovy.xml.MarkupBuilder()
xml.person(id:100){
  firstname("Jane")
  lastname("Doe")
}
// ===>
// <person id='100'>
//   <firstname>Jane</firstname>
//   <lastname>Doe</lastname>
// </person>

// StreamingMarkupBuilder
def xml = new groovy.xml.StreamingMarkupBuilder().bind{
  person(id:100){
    firstname("Jane")
    lastname("Doe")
  }
}

println xml
// ===>
// <person id='100'><firstname>Jane</firstname><lastname>Doe</lastname></person>
