// 5.9 Getting Environment Variables

println System.getenv("JAVA_HOME")
// ===> /Library/Java/Home

System.env.each{println it}
// ===>
// PWD=/Users/sdavis/groovybook/Book/code/cli
// USER=sdavis
// LOGNAME=sdavis
// HOME=/Users/sdavis
// GROOVY_HOME=/opt/groovy
// GRAILS_HOME=/opt/grails
// JAVA_HOME=/Library/Java/Home
// JRE_HOME=/Library/Java/Home
// JAVA_OPTS= -Dscript.name=/opt/groovy/bin/groovy
// SHELL=/bin/bash
// PATH=/opt/local/bin:/usr/local/bin:...
