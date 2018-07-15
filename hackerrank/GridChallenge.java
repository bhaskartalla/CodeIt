package hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class GridChallenge 
{ 
    static boolean check(int mat[][])
    {
        for(int i=1;i<mat.length;i++)
        {
            for(int j=0;j<mat.length;j++)
            {
                if(mat[i][j]<mat[i-1][j])
                {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] z)
    {
        Scanner sc=new Scanner(System.in);
        int n,mat[][];
        for(int t=sc.nextInt();t>0;t--)
        {
            n=sc.nextInt();
            mat=new int[n][n];
            String s;
            for(int i=0;i<n;i++)
            {
                s=sc.next();
                for(int j=0;j<n;j++)
                {
                    mat[i][j]=s.charAt(j);
                }
            }           
            int x[]=new int[n];            
           
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    x[j]=mat[i][j];
                }
                Arrays.sort(x);
                for(int j=0;j<n;j++)
                {
                    mat[i][j]=x[j];
                }
            }
            if(check(mat))
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
            
        }
    }
}
