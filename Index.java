/*Write a Java program to get the character at the given index within the String*/
import java.util.*;

class Index {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a string");
    String str1 = sc.nextLine();
    StringBuffer sb = new StringBuffer(str1);
    System.out.println("enter index value that you want to print");
    int n=sc.nextInt();
    System.out.println("after concatination: " + sb.charAt(n));

  }
}