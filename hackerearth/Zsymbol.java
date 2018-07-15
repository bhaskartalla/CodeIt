package hackerearth;
import java.util.Scanner;
class TestClass
{		
	
   public static void main(String z[])
   {
     Scanner sc=new Scanner(System.in);
     int a=sc.nextInt();
     int f=a-2;    
     for(int i=0;i<a;i++)
     {
            System.out.print("*");
     }  
     System.out.println();
     int f1=f;
     for(int i=1;i<=f1;i++)
     {
            for(int j=0;j<=f;j++)
            {
                if(j==f)
                {
                 System.out.print("*"); f=f-1;  
                }
                else
                {
                 System.out.print(" ");
                }
                
            }
            System.out.println();
     }
      for(int i=0;i<a;i++)
     {
            System.out.print("*");
     }  
       
     }
   }   
