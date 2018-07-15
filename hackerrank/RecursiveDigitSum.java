package hackerrank;

import java.util.Scanner;

public class RecursiveDigitSum
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        long k = sc.nextInt();
        long sum = 0;

        for (int i = 0; i < s.length(); i++)
        {
            sum += (s.charAt(i) - 48);
        }
        sum *= k;
       
        if(sum%9==0)
        {
            System.out.println(9);
        }
        else
        {
            System.out.println(sum%9);
        }
    }

}
