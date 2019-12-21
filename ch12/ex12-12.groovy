// Part 3: The Body

def atom = {
  // feed header
  ...
  
  // feed body
  StringBuffer feed = new StringBuffer()
  itemList.each{item ->
    def sw = new java.io.StringWriter()
    def x = new groovy.xml.MarkupBuilder(sw)
    x.entry(xmlns:"http://www.w3.org/2005/Atom"){
      author{name("Scott Davis")}
      published(df.format(item.datePosted))
      updated(df.format(item.datePosted))
      link(href:"http://aboutGroovy.com/item/show/${item.id}",
	rel:"alternate", title:item.title, type:"text/html")
      id("tag:aboutgroovy.com,2006:/item/show/${item.id}")
      title(type:"text", item.title)
      content(type:"xhtml"){
	div(xmlns:"http://www.w3.org/1999/xhtml"){
	  p("Category: ${item.type}")
	  p{a(href:item.url, "Original Source")}
	  p(item.shortDescription)
	  p(item.description)
	}
      }
    }
    feed.append(sw.toString() + "\n")
  }
  
  // feed footer
  ...
