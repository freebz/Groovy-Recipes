// 3.10 Groovy Truth

//true
if(1)         // any non-zero value is true
if(-1)
if(!null)     //any non-null value is true
if("John")    //any non-empty string is true

Map family = [dad:"John", mom:"Jane"]
if(family)    // true since the map is populated

String[] sa = new String[1]
if(sa)        // true since the array length is greater than 0

StringBuffer sb = new StringBuffer()
sb.append("Hi")
if(sb)        // true since the StringBuffer is populated

//false
if(0)         // zero is false
if(null)      // null is false
if("")        // empty strings are false

Map family = [:]
if(family)    // false since the map is empty

String[] sa = new String[0]
if(sa)        // false since the array is zero length

StringBuffer sb = new StringBuffer()
if(sb)        // false since the StringBuffer is empty


//in Java:
if(args != null && args.length > 0){
  File dir = new File(args[0]);
}
else{
  System.out.println("Usage: ListDir /some/dir/name");
}


//default message:
// Exception is thread "main" java.lang.ArrayIndexOutOfBoundsException: 0
//         at ListDir.main(ListDir.java:6)

//your custom error message:
// Usage: ListDir /some/dir/name


//in Groovy:
if(args){
  dir = new File(args[0])
}
else{
  println "Usage: ListDir /some/dir/name"
}
