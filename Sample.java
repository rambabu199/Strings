import java.util.*;

class Sample {
  public static void main(String arg[]) {
    Scanner sc = new Scanner(System.in);
    // creating string using literals and string class
    // example for static data
    // String str1 = "welcome";// using literals
    // String str2 = new String("wlecome");// using String class
    // System.out.println(str1);
    // System.out.println(str2);
    // example for dynamic data
    System.out.println("give 1st string");
    String str3 = new String();
    str3 = sc.next();
   System.out.println("give 2nd string");
    String str4 = new String();
    str4 = sc.nextLine();
    System.out.println("given 1st string is: " + str3);
    System.out.println("given 2nd string is :" + str4);

  }
}