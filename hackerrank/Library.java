package hackerrank;

import java.util.Scanner;

public class Library 
{
    Scanner sc =new Scanner(System.in);
    int da,de,ma,me,ya,ye;
   
    void getData()
    {
        da=sc.nextInt();
        ma=sc.nextInt();
        ya=sc.nextInt();
        de=sc.nextInt();
        me=sc.nextInt();
        ye=sc.nextInt();        
    }
    void perform()
    {
        if((ya-ye)>0)
        {
            System.out.println(10000);
        }
        else if((ma-me)>0 && (ya>=ye))
        {
            System.out.println(500*(ma-me));
        }
        else if((da-de)>0 && (ma>=me) && (ya>=ye))
        {
            System.out.println(15*(da-de));
        }
        else
        {
            System.out.println(0);
        }
    }
    
    public static void main(String[] z)
    {
        Library L1=new Library();
        L1.getData();
        L1.perform();        
    }    
}
