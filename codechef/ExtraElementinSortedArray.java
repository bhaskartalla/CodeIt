package codechef;

import java.util.Scanner;
public class ExtraElementinSortedArray
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a1[]=new int[n];
        int a2[]=new int[n-1];   
        
        for(int i=0;i<n;i++)
        {
            a1[i]=sc.nextInt(); 
        }
        for(int i=0;i<n-1;i++)
        {
            a2[i]=sc.nextInt();
        }        
        int s=0,e=n-2,ind=0,m=0;
        
        while(s<=e)
        {
            m=(s+e)/2;
            if(a1[m]==a2[m])
            {
                s=m+1;
            }
            else
            {
                ind=m;
                e=m-1;
            }
        }
        System.out.println(a1[ind]);       
    }
}
