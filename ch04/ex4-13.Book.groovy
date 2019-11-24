// 4.7 Private Methods

class Book{
  String title

  private String getTitle(){
    return title
  }
  private void setTitle(String title){
    this.title = title
  }

  private void poke(){
    println "Ouch!"
  }
}

Book book = new Book()

// notice that Groovy completely ignores the private access modifier
book.title = "Groovy Recipes"
println book.title
// ===> Groovy Recipes

book.poke()
// ===> Ouch!
