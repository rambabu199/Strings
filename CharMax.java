import java.util.*;

class CharMax {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a string");
    String str1 = sc.nextLine();
    StringBuffer sb = new StringBuffer(str1);
    String arr[] = sb.toCharArray();
    for (int i = 0; i < arr.length; i++)
      System.out.println(arr[i]);
    // String str2 = sc.nextLine();
    // System.out.println("after concatination: " + sb.append(str2));

  }
}