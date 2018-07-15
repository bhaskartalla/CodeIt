package hackerrank;
import java.util.Scanner;
public class RectangularGame
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long r=1000000000,c=1000000000,t=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<2;j++)
            {
                t=sc.nextLong();
                if(j%2==0 && r>t)
                {
                    r=t;
                }
                else if(j%2!=0 && c>t)
                {
                    c=t;
                }
            }
        }              
        System.out.print(r*c);              
    }    
}
 class SherlockandCounting 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        long n,k,count;
        for(long j=sc.nextLong();j>0;j--)
        {
            count=0;
            n=sc.nextLong();
            k=sc.nextLong();
            int i=1;
            while(i<n)
            {
                if(i*(n-i)<=(n*k))
                {
                   count+=1; 
                }                
                i++;
            }
            System.out.println(count);
        } 
    }
}
