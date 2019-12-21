package bookstore

class Author {
  static hasMany = [books:Book]

  String name
}
