// 12.3 Returning an Excel Spreadsheet

class BookController {
  def listExcel = {
    def list = Book.list(params)
    render(contentType:"application/vnd.ms-excel") {
      html{
	body{
	  h1("Books")
	  table{
	    // table header
	    tr{
	      th("ID")
	      th("Title")
	      th("Author")
	      th("Pages")
	    }

	    //table body
	    for(b in list) {
	      tr{
		td(b.id)
		td(b.title)
		td(b.author)
		td(b.pages)
}}}}}}}}
