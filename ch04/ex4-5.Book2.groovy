// Suppressing Getter/Setter Generation

class Book2{
  private String title
}

println Book2.getDeclaredField("title")
// ===> private java.lang.String Book2.title

println Book2.methods.each{println it}; "DONE"
// neither getTitle() nor setTitle() should appear in the list


def b2 = new Book2()
b2.title = "Groovy Recipes"
println b2.title
// ===> Groovy Recipes


class Book3{
  private String title
  private String getTitle(){}
  private void setTitle(title){}
}

def b3 = new Book3()
b3.title = "Groovy Recipes"
println b3.title
// ===> null


class Book3{
  private String title
  private String getTitle(){}
  private void setTitle(title){}
}

def b3 = new Book3()
b3.@title = "Groovy Recipes"
print b3.@title
// ===> Groovy Recipes
