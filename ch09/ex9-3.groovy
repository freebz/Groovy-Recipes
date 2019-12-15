// 9.3 Making an HTTP GET Request

def page = new URL("http://www.aboutgroovy.com").text===>
// ===>
// <html><head><title>...

new URL("http://www.abountgroovy.com").eachLine{line ->
  println line
}
// ===>
// <html>
// <head>
// <title>
// ...


// Processing a Request Based on the HTTP Response Code

def url = new URL("http://www.aboutgroovy.com")
def connection = url.openConnection()
if(connection.responseCode == 200){
  println connection.content.text
}
else{
  println "An error occurred:"
  println connection.responseCode
  println connection.responseMessage
}


// Getting HTTP Response Metadata

def url = new URL("http://www.aboutgroovy.com")
def connection = url.openConnection()n
connection.responseCode
// ===> 200
connection.responseMessage
// ===> OK
connection.contentLength
// ===> 4216
connection.contentType
// ===> text/html
connection.date
// ===> 1191250061000
connection.expiration
// ===> 0
connection.lastModified
// ===> 0

connection.headerFields.each{println it}
// ===>
// Content-Length=[4216]
// Set-Cookie=[JSESSIONID=3B2DE7CBDAE3D58EC46D5A8DF5AF89D1; Path=/]
// Date=[Mon, 01 Oct 2007 14:47:41 GMT]
// null=[HTTP/1.1 200 OK]
// Server=[Apache-Coyote/1.1]
// Content-Type=[text/html]


// Creating a Convenience GET Class

class Get{
  String url
  String queryString
  URLConnection connection
  String text

  String getText(){
    def thisUrl = new URL(this.toString())
    connection = thisUrl.openConnection()
    if(connection.responseCode == 200){
      return connection.content.text
    }
    else{
      return "Something bad happend\n" +
	"URL: " + this.toString() + "\n" +
	connection.responseCode + ": " +
	connection.responseMessage
    }
  }

  String toString(){
    return url + "?" + queryString
  }
}

def get = new Get(url:"http://search.yahoo.com/search")
get.queryString = "p=groovy"
println get
// ===> http://search.yahoo.com/search?p=groovy

println get.text
// ===> <html><head>...

get.url = "http://www.yahoo.com/no.such.page"
println get.text
// ===>
// Something bad happend
// URL: http://www.yahoo.com/no.such.page?p=groovy
// 404: Not Found


// RESTful GET Requests

"http://search.yahooapis.com/WebSearchService/V1/webSearch?appid=YahooDemo&query=groovy&results=10".toURL().text

//alternately, using our Get class
def get = new Get()
get.url = "http://search.yahooapis.com/WebSearchService/V1/webSearch"
get.queryString = "apiid=YahooDemo&query=groovy@results=10"
def results = get.text
