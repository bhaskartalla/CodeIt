
package hackerrank;
import java.util.Scanner;
public class SherlockandXOR 
{
     Scanner sc=new Scanner(System.in);
     int T,n,counte,counto;
        long a[];
    void perform()
    {
        T=sc.nextInt(); 
        for(int i=0;i<T;i++)
        {
            n=sc.nextInt();
            a=new long[n];
            for(int j=0;j<n;j++)
            {
                a[j]=sc.nextInt();
            }
            counte=0;
            counto=0;
            for(int x=0;x<n;x++)
            {
////                for(int y=0;y<n && y!=x;y++)
////                {
                    if((a[x])%2==0)
                    {
                        counte++;
                    }
                    else
                    {
                        counto++;
                    }
                //}
            }
            System.out.println(counte*counto);
        }        
    }
    public static void main(String[] z)
    {
       SherlockandXOR S1=new SherlockandXOR();
       S1.perform();       
    }
    
}