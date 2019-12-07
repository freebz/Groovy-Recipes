// 8.2 Creating Mixed-Case Element Names

def xml = new groovy.xml.MarkupBuilder()
xml.PERSON(id:100){
  firstName("Jane")
  LastName("Doe")
}

// ===>
// <PERSON id='100'>
//   <firstName>Jane</firstName>
//   <LastName>Doe</LastName>
// </PERSON>
