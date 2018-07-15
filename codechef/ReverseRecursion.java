package codechef;


import java.util.Scanner;
public class ReverseRecursion
{
    static int sum=0;
    static int reverse(int n)
    {
        int rem;
        if(n>0)
        {
            rem=n%10;
            sum=sum*10+rem;
            reverse(n/10);                    
        }        
        return sum;
    }    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(reverse(n));
    }
}
