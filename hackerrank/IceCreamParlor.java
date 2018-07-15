package hackerrank;
import java.math.BigInteger;
import java.util.Scanner;
public class IceCreamParlor 
{
    public static void main(String[] args) 
    {
        
        Scanner sc=new Scanner(System.in);
//        int t=sc.nextInt();
//        int m,n,c[];
//        for(int k=0;k<t;k++)
//        {
//            m=sc.nextInt();
//            n=sc.nextInt();
//            c=new int[n];
//            for(int i=0;i<n;i++)
//            {
//                c[i]=sc.nextInt();                
//            }
//            
//            out:
//            for(int i=0;i<n;i++)
//            {
//                for(int j=i+1;j<n;j++)
//                {
//                    if(m==(c[i]+c[j]))
//                    {
//                        System.out.println((i+1)+" "+(j+1));
//                        break out;
//                    }
//                }
//            }
        BigInteger t=new BigInteger("0");
        BigInteger n;
        BigInteger n1=new BigInteger("1000000007");
        for(int i=sc.nextInt();i>0;i--)
        {
            n=new BigInteger(sc.next());
            n=(n.mod(n1).multiply(n.mod(n1)));
            System.out.println(n.mod(new BigInteger("1000000007")));
        }            
    }       
        
}
    

