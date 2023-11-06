
/*Write a java program to capitalize first character of every word in a given string.*/
import java.util.*;

class Capitalize {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a String:");
    String str = sc.nextLine();
    String arr[] = str.split(" ");
    String result = " ";
    for (int i = 0; i < arr.length; i++) {
      char ch = arr[i].charAt(0);
      String sub = arr[i].substring(1);
      result = result + String.valueOf(ch).toUpperCase() + sub + " ";
    }
    System.out.print(result);
  }
}
