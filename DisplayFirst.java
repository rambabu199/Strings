/*Write a java program to display first character of every word in a given string.*/
import java.util.*;
class DisplayFirst
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a String:");
      String str= sc.nextLine();
      String arr[]=str.split(" ");
      for(int i=0;i<arr.length;i++)
        {
          String s=arr[i];
          System.out.println(" "+s.charAt(0));
        }
    }
  }