package hackerrank;


import static java.lang.Math.abs;
import java.util.Scanner;
public class DiagonalDifference 
{
    public static void main(String[] z)
    {
        int n,a[][],d1=0,d2=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        a=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++)
        {
            d1=d1+a[i][i];
            d2=d2+a[i][n-i-1];
        }
        System.out.print(abs(d1-d2));        
    }
}
