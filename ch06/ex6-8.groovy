// Quick-and-Dirty File Content Analysis

/*
// juliet.txt
O Romeo, Romeo! wherefore art thuo Remeo?
Deny the father and refuse thy name;
Or, if thou wilt not, be but sworn my love,
And I'll no longer be a Capulet.
*/

// FileStats.groovy
File file = new File("juliet.txt")
List lines = file.readLines()
println "Number of lines: ${lines.size()}"
int wordCount = 0
file.splitEachLine(" "){words ->
  println words.size()
  wordCount += words.size()
}
println "Number of words: ${wordCount}"

// ===>
// Number of lines: 4
// 7
// 7
// 10
// 7
// Number of words: 31
