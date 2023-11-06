
/*Write a Java program to compare a given string to another string, ignoring case considerations.*/
import java.util.*;

class Compare2 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a string");
    String str1 = sc.nextLine();
    StringBuffer sb = new StringBuffer(str1);
    System.out.println("enter  second string");
    String str2 = sc.nextLine();
    StringBuffer sb1 = new StringBuffer(str2);
    if (sb.equalsIgnoreCase(sb1))
      System.out.println("the both Strings are same: ");
    else
      System.out.println("the both Strings are not same: ");

  }
}