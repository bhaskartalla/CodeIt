package hackerearth;
import java.math.BigInteger;
import java.util.Scanner;

public class divisibleby7
{
    String N;
    int Q;
    int lr[][];
    String a[];
    Scanner sc = new Scanner(System.in);
    
    void getdata()
    {
        N=sc.next();
        Q=sc.nextInt();
        a=new String[Q];
        
        lr = new int[Q][2];
        
        for(int i=0;i<Q;i++)
        {
           for(int j=0;j<2;j++)
           {
               lr[i][j]=sc.nextInt();
           }            
        }
    }
    void perform()
    {
        int l,r,d;
        BigInteger f;
        char cl,rl;
        for(int i=0;i<Q;i++)
        {
            l=lr[i][0];
            r=lr[i][1];
            d=r-l;
            
            f=new BigInteger((N.substring(l-1, r)));
            System.out.println("new BigInteger(\"0\")) : "+new BigInteger("0"));
            System.out.println("f.mod(new BigInteger(\"7\")) : "+f.mod(new BigInteger("7")));
            
            if(f.mod(new BigInteger("7"))==(new BigInteger("0")))
            {
                System.out.println("YES ");
            }
            else
            {
                System.out.println("NO ");
            }   
        }      
    }
    public static void main(String z[])
    {
        divisibleby7 D1= new divisibleby7();
        D1.getdata();
        D1.perform();
    }
}