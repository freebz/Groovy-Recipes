// 8.1 The "I'm in a Hurry" Guide to Creating an XML Document

def xml = new groovy.xml.MarkupBuilder()
xml.person(id:99){
  firstname("John")
  lastname("Smith")
}
// ===>
// <person id='99'>
//   <firstname>John</firstname>
//   <lastname>Smith</lastname>
// </person>


// Capturing Output

def sw = new StringWriter()
def xml = new groovy.xml.MarkupBuilder(sw)

def fw = new FileWriter("/path/to/some/file.xml")
def xml2 = new groovy.xml.MarkupBuilder(fw)
