
/*Write a java program to display longest word and smallest word in a given string.*/
import java.util.*;

class LongSmall {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a String:");
    String str = sc.nextLine();
    String arr[] = str.split(" ");
    String max = arr[0];
    String min = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (arr[i].length() > max.length())
        max = arr[i];
      else if (arr[i].length() < min.length())
        min = arr[i];
    }
    System.out.println("the longest word in the given string is:" + max);
    System.out.println("the smallest word in the given string is:" + min);

  }
}