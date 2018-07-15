package codechef;
//done
import java.math.BigInteger;
import java.util.Scanner;


public class Sumofcakes
{    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        for(int t=sc.nextInt();t>0;t--)
        {
           int n=sc.nextInt();
           if(n==1)
           {
               System.out.println(2);
           }
           else if(n==2)
           {
               System.out.println(5);
           }
           else if(n==3)
           {
               System.out.println(13);
           }
           else if(n==4)
           {
               System.out.println(32);
           }
           else 
           {
                BigInteger ans=new BigInteger("0");
                ans=BigInteger.valueOf((long)Math.pow(2, n));
                for(int i=n-2;i>1;i--)
                {                       
                    ans=ans.add(BigInteger.valueOf(((long)(Math.pow(2, i)))*(i+1)));
                }        
                System.out.println(ans.mod(new BigInteger("1000000007")));
           }
           
        }
    }
}
