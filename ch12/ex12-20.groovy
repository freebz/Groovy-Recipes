// Part 4: Rendering the Result

def rss = {
  // feed header
  ...
  
  // feed body
  ...
  
  // feed footer
  def feedFooter = "</channel></rss>"
  response.setContentType("text/xml")
  render "${feedHeader}${feed}${feedFooter}"
}

