// 4.3 getProperty and setProperty

class Book{
  String title
}

Book book = new Book()
book.setProperty("title", "Groovy Recipes")
//book.title = "Groovy Recipes"
//book.setTitle("Groovy Recipes")

println book.getProperty("title")
//println book.title
//println book.getTitle()
// ===> Groovy Recipes
