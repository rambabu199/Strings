
/*Write a Java program to convert all the characters in a string to uppercase*/
import java.util.*;

class UpperCase {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a string");
    String str1 = sc.nextLine();
    StringBuffer sb = new StringBuffer(str1);
    sb = sb.toUpperCase();
    System.out.println("after: " + sb);
  }
}