// Part 2: The Header

def atom = {
  ...

  // feed header
  def updated = df.format(itemList[0].datePosted)
  def feedHeader = """<feed xmlns="http://www.w3.org/2005/Atom">
    <title type="text">aboutGroovy.com</title>
    <link rel="alternate" type="text/html" href="http://aboutGroovy.com"/>
    <link rel="self" type="application/atom+xml"
          href="http://aboutGroovy.com/item/atom" />
    <updated>${updated}</updated>
    <author><name>Scott Davis</name></author>
    <id>tag:aboutgroovy.com,2006-12-18:thisIsUnique</id>
    <generator uri="http://aboutGroovy.com" version="0.0.2">
      Hand-rolled Grails code
    </generator>
  """
  
  // feed body
  ...
  // feed footer
  ...
}
