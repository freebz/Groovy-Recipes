// 4.4 Making Attributes Read-Only

class Book{
  final String title

  Book(title){
    this.title = title
  }
}

Book book = new Book()
book.title = "Groovy Recipes"
// ERROR groovy.lang.ReadOnlyPropertyException:
// Cannot set readonly property: title for class: Book

Book book2 = new Book("GIS for Web Developers")
print book2.title
// ===>
// GIS for Web Developers
