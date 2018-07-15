package hackerearth;

import java.util.Arrays;
import java.util.Scanner;

public class BeinggreedyforWater 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        for(int t=sc.nextInt();t>0;t--)
        {
            int n=sc.nextInt();
            int x=sc.nextInt();
            
            int nb[]=new int[n];
            
            for(int i=0;i<n;i++)
            {
                nb[i]=sc.nextInt();
            }
            Arrays.sort(nb);
            int cb=0;
            for(int i=0;i<n;i++)
            {
                if(x>=nb[i] && x>0)
                {
                    x-=nb[i];
                    cb++;
                }
            }
            System.out.println(cb);
        }
    }
    
}

