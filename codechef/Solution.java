package codechef;

//
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution
{
    static long pow(long x, long y)
    {
        if (y == 0)
        {
            return 1;
        }
        long t = pow(x, y / 2);
        if (y % 2 == 1)
        {
            return t * t * x;
        }
        else
        {
            return t * t;
        }
    }

    public static void main(String[] args)
    {
        
        for(int i=1;i<=10;i++)
        {
            for(int j=1;j<=10;j++)
            {
                long s = pow(i,j);
                System.out.print(s+"    ");
            }
            System.out.println();
        }
        

//        Scanner sc = new Scanner(System.in);
//        int n=sc.nextInt();
//        int a[]=new int[n];        
//        for(int i=0;i<n;i++)
//        {
//            a[i]=sc.nextInt();
//        }     
//        int ans=0;
//        L1:
//        for(int l=n;l>=1;l--)
//        {
//            for(int i=0,j=l-1;j<n;i++,j++)
//            {
//                if(a[i]==a[j])
//                {
//                    ans=j-i+1;
//                    break L1;
//                }
//            }
//        }       
//        System.out.println(ans);
    }
}
