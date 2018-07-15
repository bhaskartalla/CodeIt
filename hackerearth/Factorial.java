package hackerearth;
import java.math.BigInteger;
import java.util.Scanner;

class Factorial
{
  public static void main(String z[])
  {
    int n,f[];
    BigInteger fact;
    Scanner sc=new Scanner(System.in);
    
     n=sc.nextInt();
     f=new int[n];    
     
     for(int i=0;i<n;i++)
     {
     	f[i]=sc.nextInt();
     }     
     for(int j=0;j<n;j++)
     {
     	fact=new BigInteger("1");
      	for(int i=1;i<=f[j];i++)
      	{
            fact=fact.multiply(new BigInteger(String.valueOf(i)));
      	} 
        System.out.println(fact);        
     }                    
  }
}
