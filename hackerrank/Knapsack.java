package hackerrank;

import java.util.Scanner;
//
//public class Knapsack 
//{
//    public static void main(String[] args)
//    {
//        Scanner sc = new Scanner(System.in);
//        
//        for(int t=sc.nextInt();t>0;t--)
//        {
//            int n=sc.nextInt();
//            int k=sc.nextInt();
//            int a[]=new int[n];
//            for(int i=0;i<n;i++)
//            {
//                a[i]=sc.nextInt();
//            }
//            
//            for(int i=0;i<n;i++)
//            {
//                if(k%a[i]==0)
//                {
//                    System.out.println(k);
//                    break;
//                }
//                else
//                {
//                    System.out.println("0");
//                }
//            }            
//        }       
//    }    
//}

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Knapsack
{
    public static void main(String[] args)
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();

        for (int t = 0; t < T; ++t)
        {
            int n = scan.nextInt();
            int k = scan.nextInt();

            int[] A = new int[n];
            int[][] table = new int[k + 1][n];

            for (int j = 0; j < n; ++j)
            {
                A[j] = scan.nextInt();
                table[0][j] = 0;
            }

            for (int i = 1; i <= k; ++i)
            {
                for (int j = 0; j < n; ++j)
                {
                    if (j == 0)
                    {
                        if (i >= A[j])
                        {
                            table[i][j] = table[i - A[j]][j] + A[j];
                        } else
                        {
                            table[i][j] = 0;
                        }
                    } 
                    else
                    {
                        if (i >= A[j])
                        {
                            table[i][j] = Math.max(table[i][j - 1],
                                    table[i - A[j]][j] + A[j]);
                        } else
                        {
                            table[i][j] = table[i][j - 1];
                        }
                    }
                }
            }
            System.out.println(table[k][n - 1]);
//            for (int i = 0; i <= k; ++i)
//            {
//                for (int j = 0; j < n; ++j)
//                {
//                    System.out.print(table[i][j] + " ");
//                }
//                System.out.println();
//            }
        }
    }
}
