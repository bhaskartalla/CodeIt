package codechef;


import java.util.Scanner;


public class RepeatingnMissing
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        
        int rm[]=new int[n+1];
        int x,r=0,sum=0;
        
        for(int i=1;i<=n;i++)
        {
            x=sc.nextInt();
            sum+=x;
            rm[x]++;
            if(rm[x]==2)
            {
                r=x;
            }            
        }
        System.out.println((((n*(n+1))/2)-sum+r)+"    "+r);      
    }
}
