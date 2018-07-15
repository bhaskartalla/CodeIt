package hackerrank;

import java.util.Scanner;

public class Encryption 
{
     Scanner sc=new Scanner(System.in);
     String s;
     int r,c;
     
     void perform()
     {
         s=sc.next();
         c=(int)Math.ceil(Math.sqrt(s.length()));
         r=(int)Math.floor(Math.sqrt(s.length()));  
         
         for(int i=0;i<c;i++)
         {
             for(int j=i;j<s.length();j=j+c)
             {
                 System.out.print(s.charAt(j));
             }
             System.out.print(" ");             
         }
     }
    
    public static void main(String[] z) 
    {
        Encryption E1=new Encryption();
        E1.perform();
    }
    
}


//ifmanwasmeanttostayonthegroundgodwouldhavegivenusroots
