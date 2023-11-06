
/*Write a java program to find length  of every word in a given string.*/
import java.util.*;

class Lengthword {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a String:");
    String str = sc.nextLine();
    String arr[] = str.split(" ");
    for (int i = 0; i < arr.length; i++) {
      System.out.println(" length of word is:" + arr[i].length());

    }
  }
}