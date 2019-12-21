// One-toOne Relationships

// grails-app/domain/Author.groovy
class Author{
  static constraints = {
    name()
    address()
  }

  String name
  Address address

  String toString(){
    return name
  }
}

// grails-app/domain/Address.groovy
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
