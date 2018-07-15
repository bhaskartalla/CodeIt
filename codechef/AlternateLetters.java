package codechef;


import java.util.Scanner;
public class AlternateLetters
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        boolean f[]=new boolean[26];
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            {
                System.out.print(s.charAt(i));
            }
            else if(!f[s.charAt(i)-97])
            {
                System.out.print(s.charAt(i));
                f[s.charAt(i)-97]=true;
            }
            else
            {
                f[s.charAt(i)-97]=false;
            }
        }       
    }
}
