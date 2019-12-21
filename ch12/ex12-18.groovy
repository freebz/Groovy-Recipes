// Part 3: The Body

def rss = {
  // feed header
  ...
  
  // feed body
  StringBuffer feed = new StringBuffer()
  itemList.each{item ->
    def tmp = """<item>
    <title>${item.title}</title>
    <itunes:author>Scott Davis</itunes:author>
    <itunes:subtitle></itunes:subtitle>
    <itunes:summary>${item.shortDescription}</itunes:summary>
    <enclosure url="${item.url}" length="${item.fileSize}" type="audio/mpeg" />
    <guid>${item.url}</guid>
    <pubDate>${df.format(item.datePosted)}</pubDate>
    <itunes:duration>${item.duration}</itunes:duration>
    <itunes:keywords>java,groovy,grails</itunes:keywords>
    </item>
    """
  }
  
  // feed footer
  ...
