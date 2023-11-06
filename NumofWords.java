import java.util.*;

class NumofWords {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a String:");
    String str = sc.nextLine();
    int count = 0;
    String str1[] = str.split(" ");
    for (int i = 0; i < str1.length; i++) {
      count++;
    }
    System.out.println("the count of the charectors in given string is:" + count);
  }
}
