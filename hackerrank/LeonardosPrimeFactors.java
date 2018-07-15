
package hackerrank;

import java.util.Scanner;

public class LeonardosPrimeFactors
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n,t=0,count;
        int pos=-1;
        long p[] = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47,53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
        
        for(int i=sc.nextInt();i>0;i--)
        {
            count=0;
            n=sc.nextLong();
            long pf=p[0];
            for(int j = 1; j < p.length && pf <= n && n != 1; j++)
            {
                pf = pf * p[j];
                count++;
            }
            System.out.println(count);
        }
    }
    
}
