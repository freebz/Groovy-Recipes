// 9.7 Making an HTTP DELETE Request

def url = new URL("http://localhost:8888/jaw/car/142")
def connection = url.openConnection()
connection.setRequestMethod("DELETE")
connection.connect()

def result = connection.content.text


// Creating a Convenience Delete Class

class Delete{
  String url
  QueryString queryString = new QueryString()
  URLConnection connection
  String text

  String getText(){
    def thisUrl = new URL(this.toString())
    connection = thisUrl.openConnection()
    connection.setRequestMethod("DELETE")
    if(connection.responseCode == 200){
      return connection.content.text
    }
    else{
      return "Something bad happened\n" +
	"URL: " + this.toString() + "\n" +
	connection.responseCode + ": " +
	connection.responseMessage
    }
  }

  String toString(){
    return "DELETE:\n" +
      url + "?" + queryString.toString()
  }
}

def delete = new Delete(url:"http://localhost:8888/jaw/car/142")
println delete
// ===>
// DELETE:
// http://localhost:8888/jaw/car/142

def results = delete.text
