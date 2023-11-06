import java.util.*;

class CompareOperations {
  public static void main(String args[]) {
    Scanner g = new Scanner(System.in);
    System.out.println("Give data for   string");
    String s1 = new String();
    s1 = g.nextLine();
    System.out.println("Give data for   string");
    String s2 = new String();
    s2 = g.nextLine();
    // compareto method
    System.out.println(s1.compareTo(s2));
    // == method
    System.out.println(s1 == s2);
    // equals method
    System.out.println(s1.equals(s2));
    // equalignorecase
    System.out.println(s1.equalsIgnoreCase(s2));
    // startswith method
    System.out.println(s1.startsWith("a"));
    System.out.println(s2.startsWith("b"));
    // endswith method
    System.out.println(s1.endsWith("a"));
    System.out.println(s2.endsWith("a"));
  }
}
