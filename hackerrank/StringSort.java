package hackerrank;


import java.util.Arrays;
import java.util.Scanner;

public class StringSort
{
    int T;
    String str[][];
    
    Scanner sc=new Scanner(System.in);
    StringSort()
    {
      T=sc.nextInt();
      str=new String[T][2];
   
        for(int i=0;i<T;i++)
        {
           for(int j=0;j<2;j++)
           {
             str[i][j]=sc.next();
           }  
        }  
    }
    
    void fun()
    {
      for(int i=0;i<T;i++)
        {
             int j=0;
             char alp[]=str[i][j].toCharArray();
             char srt[]=str[i][j+1].toCharArray();
             
             int ct[]=new int[srt.length]; 
             
             for(int k=0;k<srt.length;k++)
             {
                char c=srt[k];
                for(int x=0;x<26;x++)
                {
                  if(alp[x]==c)
                  {
                   ct[k]=x;
                   break;
                  }   
                }
             }
             Arrays.sort(ct);             
             for(int y=0;y<srt.length;y++)
             {
             System.out.print(alp[ct[y]]);
             }             
           System.out.println();  
        }      
    }

   public static void main(String z[])
   {
      StringSort S1=new StringSort();
      S1.fun();
   }
}