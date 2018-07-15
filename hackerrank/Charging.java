package hackerrank;
import java.util.Arrays;
import java.util.Scanner;
public class Charging 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int k=sc.nextInt();
        int x,y,z=0;
        int a[]=new int[m];
        for(int i=0;i<m;i++)
        {            
            x=sc.nextInt();
            y=sc.nextInt();
            if(x==0 && y==0)
            {
                a[z++]=4*n;
            }
            else if(x!=0 && y==0)
            {
                a[z++]=x;
            }
            else if(x==n)
            {
                a[z++]=n+y;
            }
            else if(y==n)
            {
                a[z++]=2*n+(n-x);
            }
            else if(x==0 && y!=0)
            {
                a[z++]=3*n+(n-y);
            }            
        }       
        Arrays.sort(a);       
        int ans,min=Integer.MAX_VALUE;
        for(int i=0;i<m-k+1;i++)
        {
            ans=0;
            for(int j=i,q=0;q<k-1;q++,j++)
            {
                ans+=a[j+1]-a[j];
            }
            if(ans<min)
            {
                min=ans;
            }
        }
        System.out.println(min);
    }
}