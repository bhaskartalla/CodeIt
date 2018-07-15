package hackerrank;

import java.util.Scanner;
public class BalancedBrackets 
{
    
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in); 
        String s="";
        int l=0,d=0;
        for(int q=sc.nextInt();q>0;q--)
        {
            s=sc.next();
            l=s.length();
            if(l%2!=0)
            {
                System.out.println("NO");
                continue;
            }
            else
            {
                d=l/2;
                int i=d-1,j=d,flag=0;
                while(d>0)
                {
                    if(!((s.charAt(i)=='(' && s.charAt(j)==')') || (s.charAt(i)=='[' && s.charAt(j)==']') || (s.charAt(i)=='{' && s.charAt(j)=='}')))
                    {
                        System.out.println("NO");
                        flag=1;
                        break;
                    }
                    i--;
                    j++;
                    d--;
                }
                if(flag==0)
                {
                    System.out.println("YES");
                }                
            }           
        }        
    }    
}
