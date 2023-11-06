import java.util.*;
class StringBufferSample
{
  public static void main(String args[])
  {
  
Scanner o = new Scanner(System.in);
    System.out.println("give any value for string");
 
    // b=o.nextLine(); output of netxLine() is a string
    String s = new String();
    s = o.nextLine();
    StringBuffer b = new StringBuffer(s);
    // insert operation
    System.out.println(b.append("123"));
    System.out.println(b.insert(3, "ppp"));
    System.out.println(b.delete(4, 8));
    System.out.println(b.reverse());
    System.out.println(b.replace(1, 3, "welocme"));
  }
}
