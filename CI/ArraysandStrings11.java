package CI;

import java.util.Scanner;

public class ArraysandStrings11
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        int ck=0,bi,flag=0;
        
        for(int i=0;i<s.length();i++)
        {
            bi=s.charAt(i)-'a';
            
            if((ck & (1<<bi))>0)
            {                   
                System.out.println(s.charAt(i));
                flag=1;
                break;
            }
            ck=(ck | 1<<bi);
        }
        System.out.println(s);
        
        if(flag==0)
        {
            System.out.println("Unique elements");
        }
        else
        {
            System.out.println("Duplicate elements");
        }      
    }
}

