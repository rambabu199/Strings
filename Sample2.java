import java.util.*;

class Sample2 {
  public static void main(String args[]) {
    Scanner g = new Scanner(System.in);
    System.out.println("Give data for   string");
    String s = new String();
    s = g.nextLine();
    // 1. String Length() : stringobj.lenth()---> retuns an int
    System.out.println("the size of string is" + s.length());

    // 2. String concatenation

    // 2.1 concat ---> add one string at the end of another string
    // syntax: stringobj.concat(stringvarible/stringconstant)
    // concat method returns a string
    System.out.println(s.concat("hai"));
    System.out.println("hai".concat(s));

    // 2.2 concatenation using + operator
    System.out.println(s + "hai");
    System.out.println("hai" + s);
    System.out.println("hai" + s.charAt(1));
    System.out.println( s.charAt(5));

    char t[] = s.toCharArray();
    System.out.println(" " + Arrays.toString(t));
      // 4. String Comparision (two string values)
 
    // 4.1 compareTo
    // syntax: string1.comapreTo(string2)
    // comapte to methods retuns value as 0// -ve // +ve
    System.out.println(s1.compareTo(s2));
    System.out.println(s2.compareTo(s1));
      // 4.2 == operator // return value as true /false
    //== opeartor always check the address
 
    // strng1==string2
    System.out.println(s1 == s2); // if s1=hello , s2=hello  --> flase
    // is s1=s && s2=s s1==s2---> flase
 
    String s3 = "hello";
    String s4 = "hello";
    System.out.println(s3 == s4);   //--> true
  }
}
