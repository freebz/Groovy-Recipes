// 6.1 Listing All Files in a Directory

new File(".").eachFile{file ->
  println file
}

//prints both files and directories
// ===>
// ./error.jsp
// ./GroovyLogo.zip
// ./index.jsp
// ./META-INF
// ./result.zip
// ./WEB-INF
