package hackerrank;
   
import java.util.Scanner;

public class DPCoinChange
{
    public static long makeChange(int[] coins, int money)
    {
        long comb[]=new long[money+1];
        comb[0]=1;
        for(int c : coins)
        {
            for(int i=1;i<=money;i++)
            {
                if(i >= c)
                {
                    comb[i]+=comb[i-c];
                }
            }
        }       
        return comb[money];
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int coins[] = new int[m];
        
        for(int i=0; i < m; i++)
        {
            coins[i] = sc.nextInt();
        }
        
        System.out.println(makeChange(coins, n));
    }
}


