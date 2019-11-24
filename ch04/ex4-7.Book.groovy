// Property Access with GStrings

class Book{
  String title
}

def b = new Book()
def prop = "title"
def value = "Groovy Recipes"
b."${prop}" = value
println b."${prop}"
// ===> Groovy Recipes
