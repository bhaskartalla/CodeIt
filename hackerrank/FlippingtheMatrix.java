package hackerrank;

import java.util.Arrays;
import java.util.Scanner;


public class FlippingtheMatrix
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int q=sc.nextInt();
        int n,mat[][],a[],temp,sum=0;
        
        for(int k=0;k<q;k++)
        {
            n=sc.nextInt();
            mat=new int [2*n][2*n];
            for(int i=0;i<2*n;i++)
            {
                for(int j=0;j<2*n;j++)
                {
                    mat[i][j]=sc.nextInt();
                }
            }            
            for(int i=0;i<n;i++)
            {
                a=new int[n*2];                
                for(int x=0;x<n*2;x++)
                {
                    for(int y=0;y<n*2;y++)
                    {
                        a[y]=mat[x][y];                        
                    }
                    Arrays.sort(a);
                    for( int i1 = 0; i1 < a.length/2; ++i1 ) 
                    { 
                        temp = a[i1]; 
                        a[i1] = a[a.length - i1 - 1]; 
                        a[a.length - i1 - 1] = temp; 
                    }
                    for(int y=0;y<n*2;y++)
                    {
                        mat[x][y]=a[y];                        
                    }                    
                }
                for(int x=0;x<n*2;x++)
                {
                    for(int y=0;y<n*2;y++)
                    {
                        a[y]=mat[y][x];                        
                    }
                    Arrays.sort(a);
                    for( int i1 = 0; i1 < a.length/2; ++i1 ) 
                    { 
                        temp = a[i1]; 
                        a[i1] = a[a.length - i1 - 1]; 
                        a[a.length - i1 - 1] = temp; 
                    }
                    for(int y=0;y<n*2;y++)
                    {
                        mat[y][x]=a[y];                        
                    }                    
                }                
            }
//            for(int i=0;i<n*2;i++)
//            {
//                for(int j=0;j<n*2;j++)
//                {
//                    System.out.print(mat[i][j]+" ");
//                }
//                System.out.println();
//            }
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    sum=sum+mat[i][j];
                }
            }               
            System.out.print(sum);
        }
    }
}
