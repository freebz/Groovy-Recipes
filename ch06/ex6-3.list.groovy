// Command-Line Input

// $ groovy list /some/other/dir

//list.groovy:
new File(args[0]).eachFile{file ->
  println file
}
