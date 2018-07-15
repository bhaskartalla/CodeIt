package codechef;


import java.util.Scanner;


public class Recursion123
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int n=sc.nextInt();
        
 /*****************************************************************************/
        
        
        int sum=0,mul;
        for(int i=1;i<=n;i++)
        {
            mul=1;
            for(int j=i,k=1;k<=i;k++,j++)
            {
                mul*=j;
            }
            sum+=mul;
        }
     
        
/*****************************************************************************/

        System.out.println(sum);
    }
}
