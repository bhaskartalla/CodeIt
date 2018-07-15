package hackerrank;

import java.util.Scanner;

public class AlgorithmicCrush
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int N[] = new int[n];
        int a, b, k;

        for (int i = 0; i < m; i++)
        {
            a = sc.nextInt();
            b = sc.nextInt();
            k = sc.nextInt();

            N[a-1]+=k;
            if((b)<n) 
            {
                N[b]-=k;
            } 
        }       
        long max = 0;
        long temp = 0;

        for (int i = 0; i < n; i++)
        {
            temp += N[i];
            if (temp > max)
            {
                max = temp;
            }
        }    
        System.out.println(max);
    }
}
