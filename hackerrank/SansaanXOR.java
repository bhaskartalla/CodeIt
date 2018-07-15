
package hackerrank;

import java.util.Scanner;

public class SansaanXOR 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        for(int x=sc.nextInt();x>0;x--)
        {
            int ans=0;
            int n=sc.nextInt();
            int a[]=new int[n];            
            for(int j=0;j<n;j++)
            {
                a[j]=sc.nextInt();
            }
            if(n%2==0)
            {
                ans=0;
            }
            else
            {                 
                for(int i=0;i<n;i++)
                {
                    if(i%2==0)
                    {
                        ans=ans^a[i];
                    }     
                }                   
            }  
            System.out.println(ans);
        }        
    }    
}

//import java.io.*;
//import java.util.*;
//
//public class Solution 
//{    
//    public static void main(String[] args)
//    {               
//        Scanner sc=new Scanner(System.in);
//        int t=sc.nextInt();
//        while(t-->0)
//        {           
//            int n,p=0;
//            n=sc.nextInt();
//            int[] a=new int[n];
//            
//            for(int i=0;i<n;i++)
//            {
//                a[i]=sc.nextInt();
//            }
//            if((a.length)%2==0)
//            {
//                System.out.println("0");
//            
//            }
//            else
//            {
//                for(int i=0;i<n;i=i+2)
//                {
//                    p=p^a[i];
//                }
//              System.out.println(p);
//            }
//       }
//    }
//}