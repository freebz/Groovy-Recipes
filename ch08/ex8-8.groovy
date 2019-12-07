// 8.8 Printing Out the XML Declaration

def builder = new groovy.xml.StreamingMarkupBuilder()
def person = {
  mkp.xmlDeclaration()
}
println builder.bind(person)
// ===>
// <?xml version="1.0" encoding="MacRoman"?>

//setting the encoding
def builder2 = new groovy.xml.StreamingMarkupBuilder()
builder2.encoding = "UTF-8"
println builder2.bind{
  mkp.xmlDeclaration()
}
// ===>
// <?xml version="1.0" encoding="UTF-8"?>
