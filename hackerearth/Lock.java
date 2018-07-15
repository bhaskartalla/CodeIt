package hackerearth;
import java.util.Scanner;
import java.math.BigInteger;

// this is lock 

public class Lock 
{
    int x=1,N,c=7;
    BigInteger b,t,n;
    Scanner sc=new Scanner(System.in);
    
    Lock()
    {      
        N=sc.nextInt();
    }
    
    void perform()
    {
        String s="";
        int m,n;
        b=new BigInteger("10");
        t=new BigInteger("10");
       // n=((new BigInteger("10").pow(N)).subtract(new BigInteger("1")));
        
       // for(<t.compareTo(n)!=1;t.add("1"))
        {           
           s=b.toString();
           for(int j=0;j<s.length()-1;j++)
           {
               if(!isPrime(((int)s.charAt(j)-48)+((int)s.charAt(j+1)-48)))
               {
                   c++;
               }
           }
           b=b.add(new BigInteger("1"));
        } 
        System.out.print(c*(10^9+7));
    }
    
    boolean isPrime(int n)
    {
        int flag=0;
        for(int i=2;i<n;i++) 
        {           
            if(n%i==0)
            {
                flag=1;                
            }
        }
        if(flag==1 || n==1 || n==0)
        {
            return false;
        }
        else
        {
            return true;
        }        
    } 
    public static void main(String z[])
    {
        Lock L1=new Lock();
        L1.perform();
    }
    
}
