package hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class MaxMin
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }        
        Arrays.sort(a);        
        int min=Integer.MAX_VALUE;
        for(int b=k-1,s=0;b<n;b++,s++)
        {
            if(a[b]-a[s]<min)
            {
                min=a[b]-a[s];
            }
        }        
        System.out.println(min);      
    }
}
