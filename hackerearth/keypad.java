package hackerearth;
import java.util.Scanner;

public class keypad
{

    int T;
    String s[];
    Scanner sc=new Scanner(System.in);
    
    keypad()
    {}
    void getdata()
    {
        T=sc.nextInt();
        s=new String[T];
        sc.nextLine();
        for(int t=0;t<T;t++)
        {
            s[t]=sc.nextLine();            
        }
    }
    
    void perform()
    {
        String ans="";
        int c=0;
        for(int i=0;i<T;i++)
        {
            for(int j=0;j<s[i].length();j++)
            {
                if(s[i].charAt(j)=='2')
                {
                    while(j!=s[i].length() && s[i].charAt(j)=='2')
                    {
                        c++;
                        j++;
                    }
                    if(c==1)
                    {   ans=ans+'a';    }
                    else if(c==2)
                    {   ans=ans+'b';    }
                    else if(c==3)
                    {   ans=ans+'c';    }
                }
                else if(s[i].charAt(j)=='3')
                {
                    while(j!=s[i].length() && s[i].charAt(j)=='3')
                    {
                        c++;
                        j++;
                    }
                    if(c==1)
                    {   ans=ans+'d';    }
                    else if(c==2)
                    {   ans=ans+'e';    }
                    else if(c==3)
                    {   ans=ans+'f';    }
                }
                else if(s[i].charAt(j)=='4')
                {
                    while(j!=s[i].length() && s[i].charAt(j)=='4')
                    {
                        c++;
                        j++;
                    }
                    if(c==1)
                    {   ans=ans+'g';    }
                    else if(c==2)
                    {   ans=ans+'h';    }
                    else if(c==3)
                    {   ans=ans+'i';    }
                }
                else if(s[i].charAt(j)=='5')
                {
                    while(j!=s[i].length() && s[i].charAt(j)=='5')
                    {
                        c++;
                        j++;
                    }
                    if(c==1)
                    {   ans=ans+'j';    }
                    else if(c==2)
                    {   ans=ans+'k';    }
                    else if(c==3)
                    {   ans=ans+'l';    }
                }
                else if(s[i].charAt(j)=='6')
                {
                    while(j!=s[i].length() && s[i].charAt(j)=='6')
                    {
                        c++;
                        j++;
                    }
                    if(c==1)
                    {   ans=ans+'m';    }
                    else if(c==2)
                    {   ans=ans+'n';    }
                    else if(c==3)
                    {   ans=ans+'o';    }
                }
                else if(s[i].charAt(j)=='7')
                {
                    while(j!=s[i].length() && s[i].charAt(j)=='7')
                    {
                        c++;
                        j++;
                    }
                    if(c==1)
                    {   ans=ans+'p';    }
                    else if(c==2)
                    {   ans=ans+'q';    }
                    else if(c==3)
                    {   ans=ans+'r';    }
                    else if(c==4)
                    {   ans=ans+'s';    }
                    
                
                }
                else if(s[i].charAt(j)=='8')
                {
                    while(j!=s[i].length() && s[i].charAt(j)=='8')
                    {
                        c++;
                        j++;
                    }
                    if(c==1)
                    {   ans=ans+'t';    }
                    else if(c==2)
                    {   ans=ans+'u';    }
                    else if(c==3)
                    {   ans=ans+'v';    }
                }
                else if(s[i].charAt(j)=='9')
                {
                    while(j!=s[i].length() && s[i].charAt(j)=='9')
                    {
                        c++;
                        j++;
                    }
                    if(c==1)
                    {   ans=ans+'w';    }
                    else if(c==2)
                    {   ans=ans+'x';    }
                    else if(c==3)
                    {   ans=ans+'y';    }
                    else if(c==4)
                    {   ans=ans+'z';    }
                }
                else 
                {
                    j++;
                }
                c=0;
                j--;
            }
            System.out.println(ans);
            ans="";
        }
    }
       
    public static void main(String z[])
    {
        keypad K1=new keypad();
        K1.getdata();
        K1.perform();
    }
}

//******************************************************************************
//OUTPUT
//3
//224427777552777
//7666 66652
//9999255444777
//******************************************************************************
