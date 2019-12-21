// Changing the Field Order

class Publisher {
  static constraints = {
    name()
    address()
    city()
    state()
    zipcode()
  }
  
  String name
  String address
  String city
  String state
  String zipcode

  String toString(){
    return name
  }
}
