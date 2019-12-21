// 11.9 Dynamic Scaffolding

// grails-app/Controller/PublisherController.groovy
class PublisherController {
  def scaffold = Publisher
}

// grails-app/domain/Publisher.groovy
class Publisher {
  String name
  String address
  String city
  String state
  String zipCode

  String toString(){
    return name
  }
}
