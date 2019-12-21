// Render as JSON

// return a single book as json
def showJson = {
  render Book.get( params.id ) as JSON
}

{"id:1,
  "class":"Book",
  "author":"Scott Davis",
  "pages":250,
  "title":"Groovy Recipes"
}
