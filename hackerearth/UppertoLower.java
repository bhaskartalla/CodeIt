package hackerearth;
import java.util.Scanner;

public class UppertoLower 
{
    Scanner sc=new Scanner(System.in);
    String s,sa="";
    UppertoLower()
    {
        s=sc.next();
        for(int i=0;i<s.length();i++)
        {
            if((int)(s.charAt(i))>64 && (int)(s.charAt(i))<91)
            {
                sa=sa+(char)((int)s.charAt(i)+32);
            }
            else
            {
                sa=sa+(char)((int)s.charAt(i)-32);
            }          
        }
        System.out.println(sa);
    }
    
   public static void main(String z[])
   {     
       UppertoLower U1=new UppertoLower();
   }
}
