package hackerrank;

import java.util.Scanner;
public class DicePath 
{
    static int m,n;
    
    static int maxVal(int i,int j)
    {
        if(i==m-1 && j==n-1)
        {
            return 0;
        }
        if(j==n-1)
        {
            return maxVal(i+1,j);
        }
        if(i==m-1)
        {
          return maxVal(i,j+1);
        }                
        return Math.max(maxVal(i+1,j), maxVal(i,j+1));
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        for(int t=sc.nextInt();t>0;t--)
        {
            m=sc.nextInt();
            n=sc.nextInt();
            System.out.println(maxVal(0,0));
        }
    }
}

