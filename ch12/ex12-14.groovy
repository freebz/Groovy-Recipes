// Part 4: Rendering the Result

def atom = {
  // feed header
  ...
  
  // feed body
  ...
  
  // feed footer
  def feedFooter = "</feed">
  response.setContentType("application/atom+xml")
  render "${feedHeader}${feed}${feedFooter}"
}
