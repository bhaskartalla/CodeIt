package codechef;


import java.util.Scanner;



public class SpiralMatrix
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int m=sc.nextInt();
        int n=sc.nextInt();
        
        int mat[][]=new int[m][n];
        
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                mat[i][j]=sc.nextInt();
            }
        }
        
        int k=0,l=0;
        
        while(k<m && l<n)
        {
            for(int i=l;i<n;i++)
            {
                System.out.print(mat[k][i]+" ");
            }
            k++;
            
            for(int i=k;i<m;i++)
            {
                System.out.print(mat[i][n-1]+" ");
            }
            n--;
            
            if(k<m)
            {
                for(int i=n-1;i>=l;i--)
                {
                    System.out.print(mat[m-1][i]+" ");
                }
                m--;
            }
            if(l<n)
            {
                for(int i=m-1;i>=k;i--)
                {
                    System.out.print(mat[i][l]+" ");
                }
                l++;
            }
        }   
        
    }
}
