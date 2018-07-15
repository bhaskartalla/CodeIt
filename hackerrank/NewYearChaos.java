package hackerrank;
import java.util.Scanner;
public class NewYearChaos 
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        
        int t=sc.nextInt();
        int n,q[],sum,flag=0;
        for(int k=0;k<t;k++)
        {
            n=sc.nextInt();
            q=new int[n];
            sum=0;
            for(int i=0;i<n;i++)
            {
                q[i]=sc.nextInt();
            }
            for(int j=0;j<n-1;j++)
            {
                if(q[j]>j+1)
                {
                   if((q[j]-(j+1))<=2)
                   {
                       sum=sum+q[j]-(j+1);
                   }
                   else
                   {
                       System.out.println("Too chaotic");
                       flag=1;
                       break;
                   }
                }
            }
            if(flag!=1)
            {
               System.out.println(sum); 
               flag=0;
            }            
        }
        
    }
    
}
