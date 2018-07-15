package hackerrank;

import java.util.Scanner;

public class ProgrammingCompetition
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);      
        int n=sc.nextInt();
        int x,y,rn=0,max=0;
        String sn="",st="";
        for(int i=0;i<n;i++)
        {
            st=sc.next();
            x=sc.nextInt();
            y=sc.nextInt();
            if(max<y-x)
            {
                sn=st;
                rn=y-x;
                max=y-x;
            }
        }
        
        System.out.println(sn+" "+rn);
    }
}

