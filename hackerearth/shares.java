package hackerearth;


import java.io.*;
import java.lang.*;
import java.util.*;

public class shares {
    
    Scanner sc=new Scanner(System.in);
    
    int N,D;
    long n[],d[],a[][];
    
    void getdata()
    {
      N=sc.nextInt();  
      D=sc.nextInt();  
      
      n=new long[N];
      d=new long[D];
      a=new long[D][2];
      
      for(int i=0;i<N;i++)
      {
          n[i]=sc.nextInt();
      }
      for(int i=0;i<D;i++)
      {
          d[i]=sc.nextInt();
      }
    }

    void perform()
    {
        long t;
        for(int i=0;i<D;i++)
        {
          for(int j=0;j<N-1;j++)
          {
            t=n[j];
            for(int k=j;k<N-1;k++)
            {
               if((n[(k+1)]-t)==d[i])
               {
                  a[i][0]= j+1;
                  a[i][1]= k+2;                  
               } 
            }          
          }         
        }       
    }
    
    void display()
    {
        for(int i=0;i<D;i++)
        {
              for(int j=0;j<2;j++)
              {
                 System.out.print(a[i][j]+" "); 
              }
              System.out.println(); 
        }      
    }
    
    public static void main(String z[])
    {
        shares S1=new shares();
        S1.getdata();
        S1.perform();
        S1.display();
    }
}

//******************************************************************************
//OUTPUT
//6 3
//1 2 1 7 5 6 
//21
//5
//8
//******************************************************************************