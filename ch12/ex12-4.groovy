// Returning JSON

import grails.converters.*

class BookController {
  // return a single book as json
  def showJson = {
    render Book.get( params.id ) as JSON
  }

  // return a list of books as json
  def listJson = {
    def list = Book.list(params) as Book[]
    render list as JSON
  }
}
