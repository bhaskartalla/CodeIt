package hackerrank;

import java.util.*;
import java.util.Scanner;

public class SubstringQueries 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int q=sc.nextInt();
        String s[]=new String[n];
        int mat[][]=new int[q][2];
        
        for(int i=0;i<n;i++)
        {
            s[i]=sc.next();
        }
        for(int i=0;i<q;i++)
        {
            for(int j=0;j<2;j++)
            {
                mat[i][j]=sc.nextInt();
            }
        }
        String sb,t="";
        int v=0;
        for(int i=0;i<q;i++)
        {
            sb=s[mat[0][i]];
            ArrayList l=new ArrayList();
            for( int c = 0 ; c < sb.length() ; c++ )
            {
                for( int i1 = 1 ; i1 <= sb.length() - c ; i1++ )
                {
                    l.add(sb.substring(c, c+i1));
                }
            }            
            for (Object l1 : l)
            {
                t = (l1).toString();
                if(t.contains(s[mat[0][i]]) &&  v<t.length())
                {
                    v=t.length();
                }
            } 
            System.out.println(v);
        }   
    }
    
}
