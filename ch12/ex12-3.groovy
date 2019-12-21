// Render Using a StreamingMarkupBuilder

// return a list of books as xml
def listXml = {
  def list = Book.list(params)
  render(contentType:"text/xml"){
    books{
      for(b in list){
	book(id:b.id){
	  title(b.title)
	  author(b.author)
	  pages(b.pages)
	  unescaped << "<-- coverPrice is coming in the next version -->"
}}}}}

<books>
  <book id='1'>
    <title>Groovy Recipes</title>
    <author>Scott Davis</author>
    <pages>250</pages>
    <!-- coverPrice is coming in the next version -->
  </book>
  <book id='2'>
    <title>GIS for Web Developers</title>
    <author>Scott Davis</author>
    <pages>255</pages>
    <!-- coverPrice is coming in the next version -->
  </book>
</books>
