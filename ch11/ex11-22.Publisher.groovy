// One-to-Many Relationships

// grials-app/domain/Publisher.groovy
class Publisher{
  static constraints = {
    name()
  }

  static hasMany = [books:Book]

  String name

  String toString(){
    return name
  }
}

// grails-app/domain/Book.groovy
class Book {
  static constraints = {
    title()
    author()
    pages()
    publisher()
  }

  static belongsTo = [publisher:Publisher]

  String title
  String author
  Integer pages

  String toString(){
    "${title} by ${author}"
  }
}
