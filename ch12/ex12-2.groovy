// Render as XML

// return a single book as xml
def showXml = {
  render Book.get( params.id ) as XML
}

<book id="1">
  <author>Scott Davis</author>
  <pages>250</pages>
  <title>Groovy Recipes</title>
</book>
