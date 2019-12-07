// 8.4 Creating Namespaced XML Using MarkupBuilder

def xml = new groovy.xml.MarkupBuilder()
def params = [:]
params."xmlns:product" = "urn:somecompany:products"
params."xmlns:vendor" = "urn:somecompany:vendors"
params.id = 99
xml.person(params){
  "product:name"("iPhone")
  "vendor:name"("Apple")
  quantity(1)
}

// ===>
// <person
//   xmlns:product='urn:somecompany:products'
//   xmlns:vendor='urn:somecompany:vendors'
//   id='99'>
//     <product:name>iPhone</product:name>
//     <vendor:name>Apple</vendor:name>
//     <quantity>1</quantity>
// </person>
