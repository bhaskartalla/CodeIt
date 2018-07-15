package hackerrank;

import java.util.Scanner;

public class MaximizingXOR 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int l,r,max=0;
        l=sc.nextInt();
        r=sc.nextInt();
        for(int i=l;i<=r;i++)
        {
            for(int j=l;j<=r;j++)
            {
                if((i^j)>max)
                {
                    max=(i^j);
                }
            }
        }
        System.out.print(max);
    }
    
}
