import java.util.*;

class SearchOperations {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a string");
    String str = sc.nextLine();
    // indexOf method
    // indexof(with one arg)
    System.out.println(str.indexOf("a"));
    System.out.println(str.indexOf("ab"));
    // indexof(with two args p1,p2)
    // p1==value
    // p2==index value
    System.out.println(str.indexOf("a", 5));
    System.out.println(str.indexOf("mb", 5));
    // lastIndexOf method
    System.out.println(str.lastIndexOf("a"));
    System.out.println(str.lastIndexOf("ab"));
    System.out.println(str.lastIndexOf("a", 5));
    System.out.println(str.lastIndexOf("mb", 5));
    System.out.println(str.contains("a"));
    System.out.println(str.contains("ab"));
    // substring method
    System.out.println(str.substring(1));
    System.out.println(str.substring(1, 5));
    // replace method
    System.out.println(str.replace("a", "b"));
    System.out.println(str.replace("b", "a"));
    // trim method
    System.out.println(str.trim());

  }
}
