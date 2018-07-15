package codechef;


import java.util.Scanner;

public class Segregate012
{    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        
        int l=0,h=n-1,i=0,t;
        
        while(i<=h)
        {
            if(a[i]==0)
            {
                t=a[i];
                a[i]=a[l];
                a[l]=t;
                l++;
                i++;
            }
            else if(a[i]==1)
            {
                i++;
            }
            else if(a[i]==2)
            {
                t=a[i];
                a[i]=a[h];
                a[h]=t;
                h--;
                i++;
            }
        }
        for(int j=0;j<n;j++)
        {
            System.out.print(a[j]+" ");
        }
    }
}
