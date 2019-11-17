// 3.6 Optional Exception Handling

//in Groovy:
def reader = new FileReader("/foo.txt")

//in Java:
try{
  Reader reader = new FileReader("/foo.txt")
}
catch(FileNotFoundException e){
  e.printStackTrace()
}


$ javac TestFile.java
TestFile.java:6: unreported exception java.io.FileNotFoundException;
must be caught or declared to be thrown
    Reader reader = new FileReader("/foo.txt");
1 error
