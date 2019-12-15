// 9.11 making an XML-RPC Request

def address = "1600 Pennsylvania Av, Washington, DC"
def xmlrpcRequest = """<methodCall>
  <methodName>geocode</methodname>
  <params>
    <param>
        <value><string>${address}</string></value>
    </param>
  </params>
</methodCall>"""

def xmlrpcUrl = new URL("http://geocoder.us/service/xmlrpc")
def connection = xmlrpcUrl.openConnection()
connection.setRequestMethod("POST")
connection.setRequestProperty("Content-Type","application/xml")
connection.doOutput = true
Writer writer = new OutputStreamWriter(connection.outputStream)
writer.write(xmlrpcUrl)
writer.flush()
writer.close()
connection.connect()

def xmlrpcResponse = connection.content.text


// Parsing and XML-RPC Response

//Response:
<?xml version="1.0" encoding="UTF-8"?>
<methodResponse><params><param><value><array><data><value><struct>
<member><name>number</name><value><int>1600</int></value></member>
<member><name>lat</name><value><double>38.89878</double></value></member>
<member><name>street</name><value><string>Pennsylvania</string></value></member>
<member><name>state</name><value><string>DC</string></value></member>
<member><name>city</name><value><string>Washington</string></value></member>
<member><name>zip</name><value><int>20502</int></value></member>
<member><name>suffix</name><value><string>NW</string></value></member>
<member><name>long</name><value><double>-77.037684</double></value></member>
<member><name>type</name><value><string>Ave</string></value></member>
<member><name>prefix</name><value><string></string></value></member>
</struct></value></data></array></value></param></params></methodResponse>
  
def xmlrpcResponse = connection.content.text
def methodResponse = new XmlSlurper().parseText(xmlrpcResponse)
methodResponse.params.param.value.array.data.value.struct.member.each{member ->
  if(member.name == "lat" || member.name == "long"){
    println "${member.name}: ${member.value.double}"
  }
}
