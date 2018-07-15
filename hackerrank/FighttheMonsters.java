package hackerrank;

import java.util.Scanner;
public class FighttheMonsters 
{
   
    static int  min(int hl[])
    {
        int  min=2147483647,pos=0;
        for(int i=0;i<hl.length;i++)
        {
            if(min>hl[i] && hl[i]>0)
            {
                min=hl[i];
                pos=i;
            }
        }
        return pos;
    }
    
    public static void main(String[] args) 
    {        
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int ht=sc.nextInt();
        int t=sc.nextInt();
        int[] hl=new int[n];

        for(int i=0;i<n;i++)
        {
            hl[i]=sc.nextInt();
        }
        int count=0,m;
        
        for(int i=0;i<t;i++)
        {
            m=min(hl);
            hl[m]=hl[m]-ht;   
            if(hl[m]<=0 && count<n)
            {
                count++;
            }            
        }
        System.out.println(count);
    }
    
}


//import java.io.*;
//import java.util.*;
//import java.text.*;
//import java.math.*;
//import java.util.regex.*;
//
//public class Solution {
//
//    static int twinArrays(int[] a, int[] b)
//    {
//        
//        int mi1=2147483647,mj1=2147483647,mi2=0,mj2=0,pi=0,pj=0;
//       
//        for(int i=0;i<a.length;i++)
//        {           
//            if(mi1>(a[i]))
//            {
//                mi2=mi1;
//                mi1=(a[i]);                
//                pi=i;
//            }            
//        }
//        for(int i=0;i<a.length;i++)
//        {            
//            if(mj1>=(b[i]))
//            {
//                mj2=mj1;
//                mj1=(b[i]);
//                pj=i;
//            }            
//        }
//        if(pi==pj)
//        {
//            return Math.min((mi1+mj2),(mi2+mj1));
//        }       
//        return mi1+mj1;
//    }
//
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int[] ar1 = new int[n];
//        for(int ar1_i = 0; ar1_i < n; ar1_i++){
//            ar1[ar1_i] = in.nextInt();
//        }
//        int[] ar2 = new int[n];
//        for(int ar2_i = 0; ar2_i < n; ar2_i++){
//            ar2[ar2_i] = in.nextInt();
//        }
//        int result = twinArrays(ar1, ar2);
//        System.out.println(result);
//    }
//}
//
