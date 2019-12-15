// 9.13 Parsing an Atom Feed

def atom = "http://aboutgroovy.com/item/atom".toURL().text


//Response:
<fred xmlns="http://www.w3.org/2005/Atom">
<title type="text">aboutGroovy.com</title>
<link rel="alternate" type="text/html" href="http://aboutGroovy.com"/>
<link rel="self" type="application/atom+xml"
      href="http://aboutGroovy.com/item/atom" />
<updated>2007-10-10T13:15:23-07:00</updated>
<author><name>Scott Davis</name></author>
<id>tag:aboutgroovy.com,2006-12-18:thisIsUnique</id>
<generator uri="http://aboutGroovy.com" version="0.0.2">
    Hand-rolled Grails code</generator>

  <entry xmlns='http://www.w3.org/2005/Atom'>
    <author><name>Scott Davis</name></author>
    <pulished>2007-10-10T10:44:48-07:00</published>
    <updated>2007-10-10T10:48:48-07:00</updated>
    <link href='http://aboutGroovy.com/item/show/258'
        rel='alternate'
        title='G20ne, Inc. -- Professional Support for Groovy and Grails'
        type='text/html' />
    <id>tag:aboutgroovy.com,2006:/item/show/258</id>
    <title type='text'>
      G2One, Inc. -- Professional Support for Groovy and Grails
    </title>
    <content type='xhtml'>
      <div xmlns='http://www.w3.org/1999/xhtml'>
        <p>Category: news</p>
        <p><a href='http://www.g2one.com/'>Original Source</a></p>
        <p>Groovy and Grails now have a corporate home -- G2One. The project
           leads for both Groovy and Grails (Guilaume Laforge and Graeme
           Rocher) have joined forces with Alex Tkacman (until recently
           with JetBrains) to form a new company.</p>
      </div>
    </content>
  </entry>
</feed>

def feed = new XmlSlurper().parseText(atom)
feed.entry.each{
  println it.title
  println it.published
  println "-----"
}

// ===>
// SAP Adds Groovy/Grails Support
// 2007-10-10T10:52:21-07:00
// -----
// G2One, Inc. -- Professional Support for Groovy and Grails
// 2007-10-10T10:44:48-07:00
// -----
// ...
