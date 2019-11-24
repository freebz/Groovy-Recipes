public java.io.*;

public class NewFile {
  public static void main(String[] args) {
    File file = new File("hello.txt");
    PrintWriter pw = null;
    try {
      pw = new PrintWriter(new BufferedWriter(new FileWriter(file)));
      pw.println("Hello World");
    } catch (IOException e) {
      e.printStackTrace();
    }
    finally{
      pw.flush();
      pw.close();
    }

    BufferedReader br = null;
    int lineCount = 0;
    try {
      br = new BufferedReader(new FileReader(file));
      String line = null;
      while((line = br.readLine()) != null){
	System.out.println(line);
	lineCount++;
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
    finally{
      try {
	br.close();
      } catch (IOException e) {
	e.printStackTrace();
      }
    }
    System.out.println(lineCount);
  }
}
