// Many-to-Many Relationships

// grails-app/domain/Book.groovy
class Book {
  static belongsTo = Author
  static hasMany = [authors:Author]

  String title
  Author author
}

// grails-all/domain/Author.groovy
class Author {
  static hasMany = [books:Book]

  String name
}
