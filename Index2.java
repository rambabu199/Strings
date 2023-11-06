
/*Write a Java program to get the index of a pattern in the given string*/
import java.util.*;

class Index2 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a string");
    String str1 = sc.nextLine();
    StringBuffer sb = new StringBuffer(str1);
    System.out.println("enter pattren value that you want to find index :");
    String str2 = sc.next();
    System.out.println(str2 + "is at postion of: " + sb.indexOf(str2));

  }
}