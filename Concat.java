import java.util.*;

class Concat {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a string");
    String str1 = sc.nextLine();
    StringBuffer sb = new StringBuffer(str1);
    System.out.println("enter a string to append");
    String str2 = sc.nextLine();
    System.out.println("after concatination: " + sb.append(str2));

  }
}