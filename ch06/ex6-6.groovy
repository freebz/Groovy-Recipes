// Listing Specific Files in a Directory

new File(".").eachFile{file ->
  if(file.name.endsWith(".jsp")){
    println file
  }
}

// ===>
// ./error.jsp
// ./index.jsp
// ./result.jsp


new File(".").eachFileMatch(~/.*\.jsp/){file ->
  println file
}


class JspFilter {
  boolean isCase(String filename) {
    return filename.endsWith(".jsp")
  }
}

new File(".").eachFileMatch(new JspFilter()){file ->
  println file
}


//list files greater than 500kb
new File(".").eachFile{file ->
  if(file.size() > (500 * 1024)){
    println file
  }
}

// ==>
// ./GroovyLogo.zip
