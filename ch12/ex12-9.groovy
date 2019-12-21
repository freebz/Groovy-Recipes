// 12.4 Setting Up an Atom Feed

class ItemController {
  def atom = {
    def itemList = Item.list( params )
    def df = new java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'-07:00'")

    // feed header
    def updated = df.format(itemList[0].datePosted)
    def feedHeader = """<feed xmlns="http://www.w3.org/2005/Atom">
      <title type="text">aboutGroovy.com</title>
      <updated>${updated}</updated>
      ...
    """

    // feed body
    StringBuffer feed = new StringBuffer()
    itemList.each{item ->
      def sw = new java.io.StringWriter()
      def x = new groovy.xml.MarkupBuilder(sw)
      x.entry(xmlns:"http://www.w3.org/2005/Atom"){
	author{name("Scott Davis")}
	published(df.format(item.datePosted))
	  ...
      }
      feed.append(sw.toString() + "\n")
    }

    // feed footer
    def feedFooter = "</feed>"

    response.setContentType("application/atom+xml")
    render "${feedHeader}${feed}${feedFooter}"
  }
}
