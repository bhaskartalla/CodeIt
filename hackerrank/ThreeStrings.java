package hackerrank;
import java.util.Arrays;
import java.util.Scanner;
public class ThreeStrings 
{
    public static void main(String[] z) 
    {
      Scanner sc=new Scanner(System.in);
      String a,b; 
      a=sc.next();
      b=sc.next();
      System.out.println(a.length()+b.length());
      char a1[]=a.toCharArray();
      char b1[]=b.toCharArray();
      
      Arrays.sort(a1);
      Arrays.sort(b1);
      if((a1.toString()).compareTo(b1.toString())>0)
      {
        System.out.println("No");  
      }
      else
      {
          System.out.println("Yes");
      }
      char c1=Character.toUpperCase(a.charAt(0));
      char c2=Character.toUpperCase(b.charAt(0));
      System.out.println(c1+a.substring(1)+" "+c2+b.substring(1));    
    }
}
