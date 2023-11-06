import java.util.*;

class Sample1 {
  public static void main(String arg[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("give  string");
    String str = new String();
    str = sc.nextLine();
    System.out.println("given  string is: " + str);
    System.out.println("displaying string as indiviual charectors is :");
    for (int i = 0; i <= str.length() - 1; i++)
      System.out.println(" " + str.charAt(i));
    System.out.println("displaying string as indiviual words is :");
    String arr[] = str.split(" ");// split method used to split the string
    for (int i = 0; i < arr.length; i++)
      System.out.println(" " + arr[i]);
    String b1[] = str.split("%");// % as divideing method
    for (int i = 0; i < b1.length; i++)
      System.out.println(b1[i]);
    int count=0;
    for(int i=0;i<str.length();i++)
      count++;
    System.out.println("the charectors in the given string is:"+count);

  }
}