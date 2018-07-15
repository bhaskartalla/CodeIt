
import java.util.Scanner;

public class Trouble_Sort
{
    static int[] troubleSort(int a[])
    {
        boolean done=false;
        int t=0;
        while(!done)
        {
            done=true;            
            for(int i=0;i<a.length-2;i++)
            {
                if(a[i]>a[i+2])
                {
                    done=false;
                    t=a[i];
                    a[i]=a[i+2];
                    a[i+2]=t;
                }
            }
        }
        return a;
    }
    
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        
        for(int tc=1;tc<=t;tc++)
        {
            int n=sc.nextInt();
            int a[]=new int[n];
            
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            
            int x[]=troubleSort(a);
            int flag=0;
            int k;
            for(k=0;k<n-1;k++)
            {
                if(a[k]>a[k+1])
                {
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            {
                System.out.println("Case #"+tc+": OK");
            }
            else
            {
                System.out.println("Case #"+tc+": "+k); 
            }
            
        }        
    }
}
