// bookstore/grails-app/domain/Book.groovy
class Book {
  String title
  String author
  Integer pages

  String toString(){
    return "${title} by ${author}"
  }
}
