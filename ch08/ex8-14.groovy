// 8.14 Converting CSV to XML

// input file (address.csv):
99,John Smith,456 Fleet St,Denver,CO,80021
100,Jane Doe,123 Main St,Denver,CO,80020
101,Frank Jones,345 Center Blvd,Omaha,NE,68124

// groovy file:
def fileIn = new File("address.csv")
def fileOut = new FileWriter("address.xml")
def xml = new groovy.xml.MarkupBuilder(fileOut)
xml.addressBook{
  fileIn.splitEachLine(","){ tokens ->
    entry(id:tokens[0]){
      name(tokens[1])
      address(tokens[2])
      city(tokens[3])
      state(tokens[4])
      zipcode(tokens[5])
    }
  }
}

// output file (addresses.xml):
<addressBook>
  <entry id='99'>
    <name>John Smith</name>
    <address>456 Fleet St</address>
    <city>Denver</city>
    <state>CO</state>
    <zipcode>80021</zipcode>
  </entry>
  <entry id='100'>
    <name>Jane Doe</name>
    <address>123 Main St</address>
    <city>Denver</city>
    <state>CO</state>
    <zipcode>80020</zipcode>
  </entry>
  <entry id='101'>
    <name>Frank Jones</name>
    <address>345 Center Blvd</address>
    <city>Omaha</city>
    <state>NE</state>
    <zipcode>68124</zipcode>
  </entry>
</addressBook>


// Parsing Complex CSV

// input file
99,John Smith,"456 Fleet St, Suite 123",Denver,CO,80021
100,Jane Doe,123 main St,Denver,CO,80020
101,"Frank Jones, Jr.",345 Center Blvd,Omaha,NE,68124

// output file
<addressBook>
  <entry id='99'>
    <name>John Smith</name>
    <address>"456 Fleet St</address>
    <city> Suite 123"</city>
    <state>Denver</state>
    <zipcode>CO</zipcode>
  </entry>
  <entry id='100'>
    <name>Jane Doe</name>
    <address>123 Main St</address>
    <city>Denver</city>
    <state>CO</state>
    <zipcode>80020</zipcode>
  </entry>
  <entry id='101'>
    <name>"Frank Jones</name>
    <address> Jr."</address>
    <city>345 Center Blvd</city>
    <state>Omaha</state>
    <zipcode>NE</zipcode>
  </entry>
</addressBook>


def fileIn = new File("address2.csv")
def fileOut = new FileWriter("addresses2.xml")
def xml = new groovy.xml.MarkupBuilder(fileOut)
xml.addressBook{
  use(SmartCsvParser){
    fileIn.eachLine{ line ->
      def fields = line.smartSplit()
      entry(id:fields[0]){
	name(fields[1])
	address(fields[2])
	city(fields[3])
	state(fields[4])
	zipcode(fields[5])
      }
    }
  }
}

class SmartCsvParser{
  static String[] smartSplit(String self){
    def list = []
    def st = new StringTokenizer(self, ",")
    while(st.hasMoreTokens()){
      def thisToken = st.nextToken()
      while(thisToken.startsWith("\"") && !thisToken.endsWith("\"") ){
	thisToken += "," + st.nextToken()
      }
      list << thisToken.noQuote()
    }
    return list
  }

  static String noQuote(String self){
    if(self.startsWith("\"") || self.startsWith("\'")){
      return self[1..-2]
    }
    else{
      return self
    }
  }
}
