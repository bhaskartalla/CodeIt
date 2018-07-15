package hackerrank;
import java.util.Scanner;
public class LonelyInteger
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int a=0;
        for(int i=0;i<n;i++)
        {
            a=a^sc.nextInt();
        }
        System.out.print(a);
    }    
}
