// 8.1 Converting JDBC ResultSets to XML

//table addressbook:
|name        |address         |city   |st |zipcode
+------------+----------------+-------+---+-------
|John Smith  |456 Fleet St    |Denver |CO |80021
|Jane Doe    |123 Main St     |Denver |CO |80020
|Frank Jones |345 Center Blvd |Omaha  |NE |68124

//groovy:
def sql = groovy.sql.Sql.newInstance(
  "jdbc:derby://localhost:1527/MyDbTest;create=true",
  "testUser",
  "testPassword",
  "org.apache.derby.jdbc.ClientDriver")

def xml = new groovy.xml.MarkupBuilder()
xml.addressBook{
  sql.eachRow("select * from addressbook"){ row ->
    entry{
      name(row.name)
      address(row.address)
      city(row.city)
      state(row.st)
      zipcode(row.zipcode)
    }
  }
}
