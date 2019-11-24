// Listing Only Files

new File(".").eachFile{file ->
  if(file.isFile()){
    println file
  }
}

// ===>
// ./error.jsp
// ./GroovyLogo.zip
// ./index.jsp
// ./result.jsp


new File(".").eachFileRecurse{file ->
  if(file.isFile()){
    println file
  }
}

// ===>
// ./error.jsp
// ./GroovyLogo.zip
// ./index.jsp
// ./result.jsp
// ./META-INF/MANIFEST.MF
// ./WEB-INF/web.xml
// ./WEB-INF/classes/org/davisworld/MyServlet.class
// ./WEB-INF/lib/groovy.jar
