// 4.9 Calling Java from Groovy

class BookstoreGroovy implements Bookstore{
  Book b       // written in Groovy
  Publisher p  // written in Java

  Book makeBook(){
    b = new Book(author:"Scott Davis", page:250, title:"Groovy Recipes")
  }

  Publisher makePublisher(){
    p = new Publisher(name:"Pragmatic Bookshelf")
  }
}
