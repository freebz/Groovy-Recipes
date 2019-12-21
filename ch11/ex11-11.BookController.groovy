// grails-app/controllers/BookController.groovy

class BookController {
  def list = {
    if(!params.max) params.max = 10
    [ bookList: Book.list( params ) ]
  }

  def show = {
    [ book : Book.get( params.id ) ]
  }

    ...
}
