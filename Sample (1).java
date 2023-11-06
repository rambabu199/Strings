import java.util.*;
class Sample
{
    public static void main (String[] args) 
    {
        String st1="Hai hello welcome to bitLabs";

        StringTokenizer t=new StringTokenizer(st1);   

        System.out.println("The Total Available tokens are:"+t.countTokens()+" in the string: \n"+st1);

        while(t.hasMoreTokens())
        {
            System.out.println(t.nextToken());
        }

    }
}