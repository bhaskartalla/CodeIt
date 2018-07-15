package hackerearth;

import java.util.Scanner;


public class PrimeNumbers
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n=sc.nextInt();
        boolean b;
        int count=0;
        while(n>1)
        {
            b=true;
            for(long i=2;i<=Math.sqrt(n);i++)
            {
                if(n%i==0)
                {
                    b=false;
                    break;
                }                
            }
            if(b)
            {
                count++;
            }            
            n/=10;
        }
        System.out.println(count);
    }
    
}
