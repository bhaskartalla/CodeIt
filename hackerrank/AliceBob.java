package hackerrank;

import java.util.Scanner;

public class AliceBob
{
    public static void main(String[] z) 
    {
        Scanner sc= new Scanner(System.in);
    
        int a[]=new int[3];
        int b[]=new int[3];
        int ca=0,cb=0;
        for(int i=0;i<3;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<3;i++)
        {
            b[i]=sc.nextInt();
        }
        
        for(int i=0;i<3;i++)
        {
            if(a[i]>b[i])
            {
               ca++; 
            }
            else if(a[i]<b[i])
            {
                cb++;
            }
        }
        System.out.print(ca+" "+cb);
        
    }
    
    
}
