// Spread Operator (*)

def params = []
params << "jdbc:mysql://localhost:3306/bookstore_dev?autoreconnect=true"
params << "com.mysql.jdbc.Driver"
params << "username"
params << "password"
def sql = groovy.sql.Sql.newInstance(*params)


def languages = ["Java", "Groovy", "JRuby"]
println languages*.toUpperCase()
// ===> [JAVA, GROOVY, JRUBY]
