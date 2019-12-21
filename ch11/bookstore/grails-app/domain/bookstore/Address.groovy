package bookstore

class Address{
  static constraints = {
    street()
    city()
    state()
    zipcode()
  }

  String street
  String city
  String state
  String zipcode

  String toString(){
    return "${street}, ${city}, ${state}, ${zipcode}"
  }
}
