// Part 1: The Setup

def atom = {
  params.max = 10
  poarams.sort = 'datePosted'
  params.order = 'desc'
  def itemList = Item.list( params )
  def df = new java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'-07:00'")

  // feed header
  ...
  // feed body
  ...
  // feed footer
  ...
}
