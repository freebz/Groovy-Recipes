package bookstore



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional
import grails.converters.*

@Transactional(readOnly = true)
class BookController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Book.list(params), model:[bookInstanceCount: Book.count()]
    }

    def show(Book bookInstance) {
        respond bookInstance
    }

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
    }}}}}

    // return a single book as json
    def showJson = {
      render Book.get( params.id ) as JSON
    }

    // return a list of books as json
    def listJson = {
      def list = Book.list(params) as Book[]
      render list as JSON
    }

    def listExcel = {
      def list = Book.list(params)
      response.setHeader("Content-Disposition", "attachment; filename=foo.xls")
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
    }}}}}}}
  
    def create() {
        respond new Book(params)
    }

    @Transactional
    def save(Book bookInstance) {
        if (bookInstance == null) {
            notFound()
            return
        }

        if (bookInstance.hasErrors()) {
            respond bookInstance.errors, view:'create'
            return
        }

        bookInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'book.label', default: 'Book'), bookInstance.id])
                redirect bookInstance
            }
            '*' { respond bookInstance, [status: CREATED] }
        }
    }

    def edit(Book bookInstance) {
        respond bookInstance
    }

    @Transactional
    def update(Book bookInstance) {
        if (bookInstance == null) {
            notFound()
            return
        }

        if (bookInstance.hasErrors()) {
            respond bookInstance.errors, view:'edit'
            return
        }

        bookInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Book.label', default: 'Book'), bookInstance.id])
                redirect bookInstance
            }
            '*'{ respond bookInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(Book bookInstance) {

        if (bookInstance == null) {
            notFound()
            return
        }

        bookInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Book.label', default: 'Book'), bookInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'book.label', default: 'Book'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
