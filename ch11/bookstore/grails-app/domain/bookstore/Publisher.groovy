package bookstore

class Publisher {
  static constraints = {
    name()
    address()
    city()
    state()
    zipcode()
  }

  static hasMany = [books:Book]

  String name
  String address
  String city
  String state
  String zipcode

  String toString(){
    return name
  }
}
