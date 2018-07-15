package codechef;

import java.util.Scanner;

public class JuiceJugProblem
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        
        int x[]=new int[100000000];
        x[1]=1;
        x[2]=1;       
        int t=0;
        for(int i=1;true;i++)
        {            
            if(i>2)
            {
                t=(int)(Math.pow(2, (int)(Math.log(i)/Math.log(2))));
                if(i!=0 && ((i&(i-1)) == 0))
                {
                    x[i]=1;
                }
                else
                {
                    x[i]=x[t]+x[i-t];
                }               
            }            
            if(i>=n && k>=x[i])
            {
                System.out.println(i-n);
                break;
            }
        }      
    }
}

