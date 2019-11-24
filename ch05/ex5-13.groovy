// 5.11 Calling Another Groovy Script

// hello.groovy
println "Howdy"

// goodbye.groovy
hello.main()
println "Goodbye"


public class hello{
  public static void main(String[] args){
    System.out.println("Howdy");
  }
}
