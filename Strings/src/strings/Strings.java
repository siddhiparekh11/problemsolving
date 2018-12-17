
package strings;

public class Strings {

  public static void main(String[] args) {
    String s ="siddhi...123";
    s = s.replace(".", "");
    System.out.println(s);
    String[] ar = s.split("\\+");
    System.out.println(ar[0]);
  }
  
}
