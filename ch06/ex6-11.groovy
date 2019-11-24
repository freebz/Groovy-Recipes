// Appending Data to an Existing File

File file = new File("hello.txt")
println "${file.size()} lines"
// ===> 1 lines
file.append("How's it going?\n")
file << "I'm fine, thanks.\n"
println "${file.size()} lines"
// ===> 3 lines
