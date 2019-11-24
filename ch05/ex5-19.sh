# Automatically Including JARs in the .groovy/lib Directory

//on Windows:
mkdir C:\Documents and Settings\UserName.\.groovy\lib

//on Unix, Linux, and Mac OS X:
mkdir ~/.groovy/lib

// uncomment the following line in
// $GROOVY_HOME/conf/groovy-starter.conf
# load user specific libraries
load !{user.home}/.groovy/lib/*.jar
