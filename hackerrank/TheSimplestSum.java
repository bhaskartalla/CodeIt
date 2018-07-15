package hackerrank;

import java.util.Scanner;

public class TheSimplestSum
{
    
    static int func(int k, int n)
    {
        int sum = 0;
        for (int i = 1; i <= n; i += 1)
        {
          sum += i;
          i *= k;
        }
        return sum;
    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long ans=0;
        int k=0,a=0,b=0;
        for(int t=sc.nextInt();t>0;t--)
        {
            ans=0;
            k=sc.nextInt();
            a=sc.nextInt();
            b=sc.nextInt();
            
            
            for(int i=a,sr=1;i<=b;i++,sr++)
            {
                System.out.println(sr+" - "+func(k,i));
            }
            
            
//            for(int i=a;i<=b;i++)
//            {
//                ans+=func(k,i);
//            }
//            System.out.println(ans%1000000007);            
        }
        
    }   
}
