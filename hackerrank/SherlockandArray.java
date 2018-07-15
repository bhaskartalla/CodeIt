package hackerrank;

import java.util.Scanner;

public class SherlockandArray 
{
    Scanner sc=new Scanner(System.in);
    int n,a[],t;
        
    void perform()
    {
        boolean flag;
        t=sc.nextInt();
        for(int k=0;k<t;k++)
        {
            flag=false;
            n=sc.nextInt();
            a=new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            int ls=0,rs=sum(),ts=rs;
            for(int i=0;i<n;i++)
            {
                ls=ls+((i==0)?0:a[i-1]);
                rs=rs-a[i];              
                
                if(ls==rs)
                {
                    System.out.println("YES");
                    flag=true;
                    break;
                }
            }
            if(!flag)
            {
                System.out.println("NO");
            }
        }        
    }
    
    int sum()
    {        
        int sum=0;
        for(int i=0;i<n;i++)
        {            
            sum=sum+a[i];
        } 
        return sum;
               
    }    
    public static void main(String[] args)
    {
        SherlockandArray S1=new SherlockandArray();
        S1.perform();
    }    
}
