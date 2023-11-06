
/*Write a java program to print the duplicate characters from the given String*/
import java.util.*;

class DisplayDuplicates {
  public static void main(final String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a string");
    String str1 = sc.nextLine();
    StringBuffer sb = new StringBuffer(str1);
    // StringBuffer sb1=new StringBuffer("");
    String str2 = sb.toString();
    char arr[] = str2.toCharArray();
    String arr2[] = new String[arr.length];
    for (int i = 0; i < arr.length; i++)
      arr2[i] = "-1";
    System.out.println("the duplacates charecters:");
    for (int i = 0; i < sb.length(); i++) {
      for (int j = i + 1; j < sb.length(); j++) {
        if (arr[i] == arr[j] && arr2[j].equals("-1")) {
          System.out.println(arr[j]);
          arr2[j] = "0";
        }
      }
    }
    // System.out.println("the duplacates charecters:");
    // System.out.println(sb);

  }
}