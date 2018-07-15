
package hackerrank;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class MarcsCakewalk 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        
        int c[]=new int[n];

        for(int i=0;i<n;i++)
        {
            c[i]=sc.nextInt();
        }
        Arrays.sort(c);
        
        long min=0;
        for(int i=0;i<n;i++)
        {
            min+=(Math.pow(2, i))*c[n-1-i];
        }       
        System.out.println(min);
    }    
}
