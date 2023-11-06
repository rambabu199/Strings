
/*Write a Java program to get the character at the given index within the String*/
import java.util.*;

class Getchar {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a string ");
    String str = sc.nextLine();
    System.out.println("enter the index value ");
    int i = sc.nextInt();
    System.out.println("the value of given index number " + i + "is " + str.charAt(i));
  }
}