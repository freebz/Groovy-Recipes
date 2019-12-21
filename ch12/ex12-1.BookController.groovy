// 12.1 Returning XML

import grails.converters.*

class BookController {
  // return a single book as xml
  def showXml = {
    render Book.get( params.id ) as XML
  }

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
	    unescaped << "<!-- coverPrice is coming in the next version -->"
}}}}}}
