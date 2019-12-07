// 8.9 Printing Out Processing Instructions

def builder = new groovy.xml.StreamingMarkupBuilder()
def person = {
  mkp.pi("xml-stylesheet": "type='text.xsl' href='myfile.xslt'")
}
println builder.bind(person)
// ===>
// <?xml-stylesheet type='text.xsl' href='myfile.xslt'?>
