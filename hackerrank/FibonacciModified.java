package hackerrank;

import java.math.BigInteger;
import java.util.Scanner;

public class FibonacciModified 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BigInteger t1=new BigInteger(sc.next());
        BigInteger t2=new BigInteger(sc.next());
        int n=sc.nextInt();
        BigInteger tn=new BigInteger("0");
        for(int i=2;i<n;i++)
        {
            tn=t1.add(t2.multiply(t2));
            t1=t2;
            t2=tn;
        }
        System.out.print(tn);
    }    
}
