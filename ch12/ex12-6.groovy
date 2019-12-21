// Rendering a JSON List

// return a list of books as json
def listJson = {
  def list = Book.list(params) as Book[]
  render list as JSON
}

[
  {"id":1,
    "class":"Book",
    "author":"Scott Davis",
    "pages":250,
    "title":"Groovy Recipes"},
  {"id":2,
    "class":"Book",
    "author":"Scott Davis",
    "pages":255,
    "title":"GIS for Web Developers"}
]
