package hackerearth;
import java.util.Scanner;
import java.lang.*;
class LedNos
{
   public static void main(String z[])
   {
       String n;
       int ans=0,t=0;
       int ld[]={6,2,5,5,4,5,6,3,7,6};
       Scanner sc=new Scanner(System.in);  
        n=sc.next();
        for(int i=0;i<n.length();i++)
        {
            ans=ans+ld[(n.charAt(i)-48)];           
        }      
        System.out.println(ans);
   }
}


//******************************************************************************
//OUTPUT
//12134
//******************************************************************************




