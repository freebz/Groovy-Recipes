// 8.7 Creating namespaced XML Using StreamingMarkupBuilder

def builder = new groovy.xml.StreamingMarkupBuilder().bind{
  mkp.declareNamespace('':'http:/myDefaultNamespace')
  mkp.declareNamespace('location':'http://someOtherNamespace')
  person(id:100){
    firstname("Jane")
    lastname("Doe")
    location.address("123 Main St")
  }
}
println builder
// ===>
// <person id='100'
//       xmlns='http:/myDefaultNamespace'
//       xmlns:location='http://someOtherNamespace'>
//   <firstname>Jane</firstname>
//   <lastname>Doe</lastname>
//   <location:address>123 Main St</location:address>
// </person>
