imoprt java.io.File;

public class DirList {
  public static void main(String[] args) {
    File dir = new File(".");
    File[] files = dir.listFiles();
    for (int i = 0; i < files.length; i+) {
      File file = files[i];
      System.out.println(file);
    }
  }
}
