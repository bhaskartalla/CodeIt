package codechef;


import java.util.Scanner;


public class PrintWordsWithoutIfSwitch
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        
        String w[] = {"zero", "one", "two", "three","four",
                   "five", "six", "seven", "eight", "nine"};
        String t="";
        do
        {
            t+=w[n%10]+" ";
            n/=10;
        }while(n>0);
        
        String r[]=t.split(" ");
        
        for(int i=r.length-1;i>=0;i--)
        {
            System.out.print(r[i]+" ");
        }
        
    }
}
