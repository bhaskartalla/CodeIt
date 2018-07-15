package codechef;
import java.util.Scanner;
//done
public class StringNecklace
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        for(int t=sc.nextInt();t>0;t--)
        {
            String s=sc.next(),a="";
            int l=s.length();
            char c;
            for(int i=0;i<l;i++)
            {
                c=s.charAt(i);
                
                if(i!=l-1)
                {
                    if(c==s.charAt(i+1) && c!='?')
                    {
                        System.out.print("Not found");
                        break;
                    }
                }
                if(c=='?')
                {
                    if(i==0)
                    {
                        if(s.charAt(i+1)!='a' && s.charAt(l-1)!='a')
                        {
                            a+="a";
                        }
                        else if(s.charAt(i+1)!='b' && s.charAt(l-1)!='b')
                        {
                            a+="b";
                        }
                        else
                        {
                            a+="c";
                        }
                    }
                    else if(i==l-1)
                    {
                        if(a.charAt(l-2)!='a' && a.charAt(0)!='a')
                        {
                            a+="a";
                        }
                        else if(a.charAt(l-2)!='b' && a.charAt(0)!='b')
                        {
                            a+="b";
                        }
                        else
                        {
                            a+="c";
                        }
                    }
                    else
                    {
                        if(a.charAt(i-1)!='a' && s.charAt(l+1)!='a')
                        {
                            a+="a";
                        }
                        else if(a.charAt(i-1)!='b' && s.charAt(l+1)!='b')
                        {
                            a+="b";
                        }
                        else
                        {
                            a+="c";
                        }
                    }
                }
                else
                {
                    a+=c;
                }                
            }
            System.out.println(a);
        }  
    }
}
