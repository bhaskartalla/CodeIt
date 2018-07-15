package codechef;
//done
import java.util.Scanner;

public class GemArrangements
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);        
        for(int q=sc.nextInt();q>0;q--)
        {
            String s=sc.next();
            int l=s.length();
            int flag=0;
            String s1="",s2="";
            for(int i=0;i<l;i++)
            {
                s1=s.substring(0,i)+s.substring(i+1,l);
                s2=((new StringBuilder(s1)).reverse()).toString();
                if(s1.equals(s2))
                {
                    flag=1;
                    break;
                }                
            }    
            if(flag==1)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
    }
}
