package hackerrank;

import java.util.Scanner;
public class SherlockandDivisors 
{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        long n,count=0;
        for(long i=sc.nextLong();i>0;i--)
        {
            n=sc.nextLong();
            if(n%2==0)
            {
                for(long j=2;j<=n/2;j++)
                {
                    count=1;
                    if(j%2==0 && n%j==0)
                    {
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }    
}
