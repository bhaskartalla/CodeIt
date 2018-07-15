package hackerearth;


import java.io.*;
import java.lang.*;
import java.util.*;

public class divides {

    Scanner sc =new Scanner(System.in);
    int n,sn;
    int a=0;
 
    void getdata()
    {
        n=sc.nextInt();
    }
    
    void perform()
    {
       sn=n*n;
       for(int i=2;i<n;i++)
       {
          if(sn%i==0 && n%i!=0) 
          {
             a=a+1; 
          }
       }     
    }
    
    void display()
    {
        System.out.println(a);
    }
    
    public static void main(String z[])
    {
        divides D1=new divides();
        D1.getdata();
        D1.perform();
        D1.display();
    }
    
}
