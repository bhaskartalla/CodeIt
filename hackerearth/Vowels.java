package hackerearth;
import java.util.Scanner;

public class Vowels 
{
    int T,cv,cc,flag;
    String s[];
    Scanner sc = new Scanner(System.in);
    
    Vowels()
    {
        T=cv=cc=flag=0;
    }
    
    void getdata()
    {
        T=sc.nextInt();
        s=new String[T];
        
        for(int t=0;t<T;t++)
        {
            s[t]=sc.next();
        }
    }
    
    void poerform()
    {
        for(int i=0;i<T;i++)
        {
            for(int j=0;j<s[i].length();j++)
            {
                if(s[i].charAt(j)=='a' || s[i].charAt(j)=='i' || s[i].charAt(j)=='e' || s[i].charAt(j)=='o' || s[i].charAt(j)=='u' || s[i].charAt(j)=='y'  )
                {
                    cv++;
                    flag=0;                    
                }
                else
                {
                   cc++;
                   flag++;
                   if(flag==3)
                   {
                       System.out.println("hard");
                       break;
                   }
                }
            }
            if(cv<cc && flag!=3)
            {
                System.out.println("hard");
            }
            else if(cv>=cc && flag!=3)
            {
                System.out.println("easy");
            }
            cv=cc=flag=0;
        }
    }
    
    public static void main(String z[])
    {
        Vowels V1=new Vowels();
        V1.getdata();
        V1.poerform();
    }
    
}

//******************************************************************************
//OUTPUT
//4
//qwertt
//aseifgou
//aeiousdf
//mkloij
//******************************************************************************