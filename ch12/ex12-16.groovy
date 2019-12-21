// Part 1: The Setup

def rss = {
  params.max = 10
  params.sort = 'datePosted'
  params.order = 'desc'
  def itemList = Podcast.list( params )
  def df = new java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'-07:00'")

  // feed header
  ...
  // feed body
  ...
  // feed footer
  ...
}
