// 6.2 Reading the Contents of a File

new File("x.txt").eachLine{line->
  println line
}


// Reading the Contents of a File into a String Variable

String body = new File("x.txt").text


// Reading the Contents of a File into an ArrayList

List lines = new File("x.txt").readLines()
