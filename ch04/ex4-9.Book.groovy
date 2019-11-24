// 4.5 Constructor Shortcut Syntax

class Book{
  String title
  String author
  Integer pages
}

Book book1 = new Book(title:"Groovy Recipes", author:"Scott Davis", pages:250)
Book book2 = new Book(pages:230, author:"Scott Davis",
                   title:"Gis for Web Developers")
Book book3 = new Book(title:"Google Maps API")
Book book4 = new Book()
