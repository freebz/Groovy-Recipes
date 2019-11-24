// Listing Only Directories

new File(".").eachDir{dir ->
  println dir
}

// ===>
// ./META-INF
// .WEB-INF


new File(".").eachDirRecurse{dir ->
  println dir
}

// ===>
// ./METAINF
// ./WEB-INF
// ./WEB-INF/classes
// ./WEB-INF/classes/org
// ./WEB-INF/classes/orgdavisworld
// ./WEB-INF/lib
