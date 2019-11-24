// 6.3 Writing Text to a File

File file = new File("hello.txt")
file.write("Hello World\n")
println file.text
// ===>
// Hello World

println file.readLines().size()
// ==>
// 1
