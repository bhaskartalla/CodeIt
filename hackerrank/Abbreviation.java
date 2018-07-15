package hackerrank;

import java.util.Scanner;

public class Abbreviation
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int q=sc.nextInt();
        String a[],b[];
        boolean flag;
        a=new String[q];
        b=new String[q];
        for(int i=0;i<q;i++)
        {
            a[i]=sc.next();
            b[i]=sc.next();
        }        
        for(int i=0;i<q;i++)
        {
            flag=false;
            for(int j=0;j<b[i].length();j++)
            {
                if(!(a[i].contains(Character.toString(b[i].charAt(j))) || a[i].contains(Character.toString(b[i].charAt(j)).toLowerCase())) )
                {                    
                    System.out.println("NO");
                    flag =true;
                    break;
                }
            }
            if(flag==false)
            {
                System.out.println("YES");
            }
        }
    }
    
}




