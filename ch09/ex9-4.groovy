// 9.4 Working with Query Strings

"http://search.yahoo.com/search?p=groovy".toURL().text


"http://maps.google.com/maps?f=q=hl=en&geocode=&time=&date=&ttype=&q=dia&sll=37.0625,-95.677068&sspn=34.038806,73.12&ie=UTF8&ll=39.87075,-104.694214&spn=0.2577,0.751289&z=11&iwloc=addr&om1=&t=h".toURL().text


// Building the Query String from a List

def queryString = []
queryString << "n=" + URLEncoder.encode("20")
queryString << "vd=" + URLEncoder.encode("m3")
queryString << "vl=" + URLEncoder.encode("lang_en")
queryString << "vf=" + URLEncoder.encode("pdf")
queryString << "p=" + URLEncoder.encode("groovy grails")

def address = "http://search.yahoo.com/search"
def url = new URL(address + "?" + queryString.join("&"))
println url
// ===> http://search.yahoo.com/search?n=20&vd=m3&vl=lang_en&vf=pdf&p=groovy+grails

println url.text


// Building the Query String from a Map

def map = [n:20, vf:"pdf", p:"groovy grails"]
def list = []
map.each{name,value->
  list << "$name=" + URLEncoder.encode(value.toString())
}
println list.join("&")
// ===> n=20&vf=pdf&p=groovy+grails


// Creating a Convenience QueryString Class

class QueryString{
  Map params = [:]

  //this constructor allow you to pass in a Map
  QueryString(Map params){
    if(params){
      this.params.putAll(params)
    }
  }

  //this method allows you to add name/value pairs
  void add(String name, Object value){
    params.put(name, value)
  }

  //this method returns a well-formed QueryString
  String toString(){
    def list = []
    params.each{name,value->
      list << "$name=" + URLEncoder.encode(value.toString())
    }
    return list.join("&")
  }
}

def qs = new QueryString(n:20, vf:"pdf", p:"groovy grails")
println qs
// ===> n=20&vf=pdf&p=groovy+grails

def qs2 = new QueryString()
qs2.params.put("firstname", "Scott")
qs2.add("id", 99)
qs2.add "updated", new Date()
println qs2
// ===> firstname=Scott&id=99&updated=Wed+Oct+10+20%3A17%3A34+MDT+2007


class Get{
  String url
  QueryString queryString = new QueryString()
  URLConnection connection
  String text

  String getText(){
    def thisUrl = new URL(this.toString())
    connection = thisUrl.openConnection()
    if(connection.responseCode == 200){
      return connection.context.text
    } else{
      return "Something bad happened\n" +
	"URL: " + this.toString() + "\n" +
	connection.responseCode + ": " +
	connection.responseMessage
    }
  }

  String toString(){
    return url + "?" + queryString.toString()
  }
}
def get = new Get(url:"http://search.yahoo.com/search")
get.queryString.add("n", 20)
get.queryString.add("vf", "pdf")
get.queryString.add("p", "groovy grails")

println get
// ===> http://search.yahoo.com/search?n=20&vf=pdf&p=groovy+grails

println get.text
// ===> <html><head>...
