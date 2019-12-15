// 9.12 Parsing Yahoo Search Results as XML

def yahooAddress = "http://search.yahooapis.com/WebSearchService/V1/webSearch?"
def queryString = "appid=YahooDemo&query=groovy&results=10"
def xmlResponse = "${yahooAddress}${queryString}".toURL().text


// Parsing XML Yahoo Search Results

//Response:
<ResultSet
xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
xmlns="urn:yahoo.srch"
xsi:schemaLocation="urn:yahoo:srch
  http://api.search.yahoo.com/WebSearchService/V1/WebSearchResponse.xsd"
type="web"
totalResultsAvailable="20700000"
totalResultsReturned="10"
firstResultPosition="1"
moreSearch="/WebSearchService/V1/sebSearch?query=groovy&map;appid=YahooDemo">
  <Result>
    <title>Groovy - Home</title>
    <Summary>Groovy ... </Summary>
    <Url>http://groovy.codehaus.org</Url>
    <ClickUrl>http://uk.wrs.yahoo.com/</ClickUrl>
    <DisplayUrl>groovy.codehaus.org</DisplayUrl>
    <ModificationDate>1191394800</ModificationDate>
    <MimeType>text/html</MimeType>
    <Cache><Url>http://uk.wrs.yahoo.com</Url><Size>39661</Size></Cache>
  </Result>
</ResultSet>

def ResultSet = new XmlSlurper().parseText(xmlResponse)
ResultSet.Result.each{
  println it.Title
  println it.Url
  println "-----"
}
// ===>
// Groovy - Home
// http://groovy.codehaus.org/
// -----
// Groovy -Wikipedia, the free encyclopedia
// http://en.wikipedia.org/wiki/Groovy
// -----
// ...
