package hackerrank;

import java.util.Scanner;

public class LongArray 
{
    public static void main(String[] z) 
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        long arr=0;
        for(int i=0;i<n;i++)
        {
            arr=arr+sc.nextLong();
        }
        System.out.print(arr);   
    }    
}
