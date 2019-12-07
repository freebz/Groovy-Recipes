// 8.10 Printing Arbitrary Strings(Comments, CDATA)

def comment = "<!-- address is optional -->"
def builder = new groovy.xml.StreamingMarkupBuilder().bind{
  person(id:99){
    firstname("John")
    lastname("Smith")
    mkp.yieldUnescaped(comment)
    unescaped << comment
  }
}
println builder
// ===>
// <person id='99'>
//   <firstname>John</firstname>
//   <lastname>Smith</lastname>
//   <!-- address is optional -->
//   <!-- address is optional -->
// </person>


def comment = "<!-- address is optional -->"
def builder = new groovy.xml.StreamingMarkupBuilder().bind{
  mkp.yieldUnescaped(comment)
  unescaped << comment
  mkp.yield(comment)
  out << comment
}
println builder
// ===>
// <!-- address is optional -->
// <!-- address is optional -->
// &lt;!-- address is optional --&gt;
// &lt;!-- address is optional --&gt;


// CDATA

def cdata = " >< & Look 'at' me & >< "
def builder = new groovy.xml.StreamingMarkupBuilder().bind{
  unescaped << "<![CDATA[" + cdata + "]]>"
}
println builder
// ===>
// <![CDATA[ >< & Look 'at' me & >< ]]>
