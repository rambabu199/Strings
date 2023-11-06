
/*Write a java program to remove all duplicates from a given string?*/
import java.util.*;

class RemoveDuplicates {
  public static void main(final String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a string");
    String str1 = sc.nextLine();
    StringBuffer sb = new StringBuffer(str1);
    String str2 = sb.toString();
    char arr[] = str2.toCharArray();
    for (int i = 0; i < sb.length(); i++) {
      for (int j = i + 1; j < sb.length(); j++) {
        if (arr[i] == arr[j]) {
          sb.deleteCharAt(j);
        }
      }
    }
    System.out.println("after removing duplacates :");
    System.out.println(sb);

  }
}