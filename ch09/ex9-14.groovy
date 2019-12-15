// 9.14 Parsing an RSS Feed

def rssFeed = "http://aboutgroovy.com/podcast/rss".toURL().text

//Response:
<rss xmlns:itunes="http://www.itunes.com/dtds/popcast-1.0.dtd" version="2.0">
  <channel>
  <title>About Groovy Podcasts</title>
  <link>http://aboutGroovy.com</link>
  <language>en-us</language>
  <copyright>2007 AboutGroovy.com</copyright>
  <itunes:subtitle>
    Your source for the very latest Groovy and Grails new
  </itnues:subtitle>
  <itnues:author>Scott Davis</itunes:author>
  <itunes:summary>About Groovy interviews</itunes:summary>
  <description>About Groovy interviews<description>
  <itunes:owner>
    <itunes:name>Scott Davis</itunes:name>
    <itunes:email>scott@aboutGroovy.com</itunes:email>
  </itunes:owner>
  <itunes:image href="http://aboutgroovy.com/images/aboutGroovy3.png" />
  <itunes:category text="Technology" />
  <itunes:category text="Java" />
  <itunes:category text="Groovy" />
  <itunes:category text="Grails" />
  <item>
    <title>AboutGroovy Interviews Neal Ford</title>
    <itunes:author>Scott Davis</itunes:author>
    <itunes:subtitle></itunes:subtitle>
    <itunes:summary>Neal Ford of ThoughtWorks is truly a polyglot programmer.
      In this exclusive interview, Neal opines on Groovy, Ruby, Java, DSLs, and
      the future of programming languages. Opinionated and entertaining, Neal
      doesn't pull any punches. Enjoy.
    </itunes:summary>
    <enclosure url="http://aboutgroovy.com/podcasts/NealFord.mp3"
               length="33720522" type="audio/mpeg" />
    <guid>http://aboutgroovy.com/podcasts/NealFord.mp3</guid>
    <pubDate>2007-04-17T01:15:00-07:00</pubDate>
    <itunes:duration>44:19</ituens:duration>
    <itunes:keywords>java,groovy,grails</itunes:keywords>
  </item>
</channel>
</rss>

def rss = new XmlSlurper().parseText(rssFeed)
rss.channel.item.each{
  println it.title
  println it.pubDate
  println it.enclosure.@url
  println it.duration
  println "-----"
}

// ===>
// AboutGroovy Interviews Neal Ford
// 2007-04-17T01:15:00-07:00
// http://aboutgroovy.com/podcasts/NealFord.mp3
// 44:19
// -----
// AboutGroovy Interviews Jeremy Rayner
// 2007-03-13T01:18:00-07:00
// http://aboutgroovy.com/podcasts/JeremyRayner.mp3
// 50:54
// -----
// ...
