// Interfaces in Groovy and Java

// Bookstore.java
public interface Bookstore {
  public Book makeBook();
  public Publisher makePublisher();
}

// BookstoreGroovy.groovy
class BookstoreGroovy implements Bookstore{...}

// BookstoreJava.java
public class BookstoreJava implements Bookstore {...}
