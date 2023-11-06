import java.util.*;

class NumofChar {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a String:");
    String str = sc.nextLine();
    int count = 0;
    char t[] = str.toCharArray();
    for (int i = 0; i < t.length; i++) {
      count++;
    }
    System.out.println("the count of the charectors in given string is:" + count);
  }
}
