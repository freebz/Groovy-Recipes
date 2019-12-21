// Part 2: The Header

def rss = {
  ...

  // feed header
  def feedHeader = """
  <rss xmlns:itunes="http://www.itunes.com/dtds/podcast-1.0.dtd"
       version="2.0">
  <channel>
    <title>About Groovy Podcasts</title>
    <link>http://aboutGroovy.com</copyright>
    <itunes:subtitle>
      Your source for the very latest Groovy and Grails news
    </itnues:subtitle>
    <itunes:author>Scott Davis</itunes:author>
    <itunes:summary>About Groovy interviews</itunes:summary>
    <description>About Groovy interviews</description>
    <itunes:owner>
      <itunes:name>Scott Davis</itunes:name>
      <itunes:email>scott@aboutGroovy.com</description>
    </itunes:owner>
    <itunes:image href="http://aboutgroovy.com/images/aboutGroovy3.png" />
    <itunes:category text="Technology" />
    <itunes:category text="Java" />
    <itunes:category text="Groovy" />
    <itunes:category text="Grails" />
    """
  
  // feed body
  ...
  // feed footer
  ...
}
