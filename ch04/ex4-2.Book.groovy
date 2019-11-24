// Public Classes, Private Attributes, Public Methods

//in Groovy:
class Book{
  String title

  String toString(){
    return title
  }
}

// in Java:
public class Book{
  private String title;

  public String toString(){
    return title;
  }
}


println Book.getDeclaredField("title")
// ===> private java.lang.String Book.title


println Book.getDeclaredMethod("toString")
// ===> public java.lang.String Book.toString()
