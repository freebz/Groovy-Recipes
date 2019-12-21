// 12.5 Setting Up an RSS Feed for Podcasts

class PodcastController {
  def rss = {
    def itemList = Podcast.list( params )
    def df = new java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'-07:00'")

    // feed header
    def updated = df.format(itemList[0].datePosted)
    def feedHeader = """
    <rss xmlns:itunes="http://www.itunes.com/dtds/podcast-1.0.dtd"
         version="2.0">
    <channel>
      <title>About Groovy Podcasts</title>
      <link>http://aboutGroovy.com</link>
      ...
    """

    // feed body
    StringBuffer feed = new StringBuffer()
    itemList.each{item ->
      def tmp = """<item>
      <title>${item.title}</title>
      <itunes:author>Scott Davis</itunes:author>
      <enclosure url="${item.url}"
                 length="${item.fileSize}" type="audio/mpeg" />
      ...
      """
      feed.append(tmp + "\n")
    }

    // feed footer
    def feedFooter = "</channel></rss>"

    response.setContentType("text/xml")
    render "${feedHeader}${feed}${feedFooter}"
  }
}
