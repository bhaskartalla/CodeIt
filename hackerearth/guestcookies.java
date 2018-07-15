package hackerearth;

import java.io.*;
import java.lang.*;
import java.util.*;

public class guestcookies
{
    
    int N,M,a;
    Scanner sc= new Scanner(System.in);
    
    void getdata()
    {
        N=sc.nextInt();
        M=sc.nextInt();   
    }
    void perform()
    {
        if(M%N==0)
        {
            a=0;
        }
        else
        {
           a=N-(M%N);  
        }     
    }
    void display()
    {
        System.out.println(a);
    }
    
    
    public static void main(String z[])
    {
        guestcookies G1=new guestcookies();
        
        G1.getdata();
        G1.perform();
        G1.display();
        
    }
}


//******************************************************************************
//OUTPUT
//4 17
//******************************************************************************
