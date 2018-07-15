package hackerrank;

import java.util.Scanner;

public class MaximumSubarraySum
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int t=sc.nextInt();t>0;t--)
        {
            int n=sc.nextInt();
            int m=sc.nextInt();            
            int a[]=new int[n];
            boolean b=false;          
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            int sum,max=0;            
            for(int i=0;i<n;i++)
            {
                sum=0;                
                for(int j=i;j<n;j++)
                {
                    sum+=a[j]; 
                    if(max<sum%m)
                    {
                        max=sum;
                    }
                }                 
            }       
            System.out.println(max); 
        }
    }  
}
