// 8.12 StreamingMarkupBuilder at a Glance

def comment = "<!-- address is new to this release -->"
def builder = new groovy.xml.StreamingMarkupBuilder()
builder.encoding = "UTF-8"
def person = {
  mkp.xmlDeclaration()
  mkp.pi("xml-stylesheet": "type='text/xsl' href='myfile.xslt'" )
  mkp.declareNamespace('':'http://myDefaultNamespace')
  mkp.declareNamespace('location':'http://someOtherNamespace')
  person(id:100){
    firstname("Jane")
    lastname("Doe")
    mkp.yieldUnescaped(comment)
    location.address("123 Main")
  }
}
def writer = new FileWriter("person.xml")
writer << builder.bind(person)

System.out << builder.bind(person)
// ===>
// <?xml version="1.0" encoding="UTF-8"?>
// <?xml-stylesheet type='text/xsl' href='myfile.xslt'?>
// <person id='100'
//     xmlns='http://myDefaultNamespace'
//     xmlns:location='http://someOtherNamespace'>
//   <firstname>Jane</firstname>
//   <lastname>Doe</lastname>
//   <!-- address is new to this release -->
//   <location:address>123 Main</location:address>
// </person>
