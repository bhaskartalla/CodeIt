
import java.io.*;
import java.lang.*;
import java.util.*;


class P1
{
  
    
  public static void main(String z[])
  {
      String st[];
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      st=new String[t];
      
      for(int i=0;i<t;i++)
      {
          st[i]=sc.next();
      }
      
      for(int k=0;k<t;k++)
      {
          char ch[]=new char[st[k].length()];
          ch=st[k].toCharArray();
          char tempch;
          String tempst;
          
          for(int i=0;i<st[k].length();i++)
          {
              for(int j=0;j<st[k].length();j++)
              {
                  if(ch[i]<ch[j])
                  {
                    tempch=ch[i];
                    ch[i]=ch[j];
                    ch[j]=tempch;
                  }
              }
          }
          tempst=new String(ch);
          st[k]=tempst;
      }
      
      for(int i=0;i<t;i++)
      {
          System.out.println(st[i]);
      }     
  }
}



//******************************************************************************
//OUTPUT
//1
//zyxwvutsrqponmlkjihgfedcba
//******************************************************************************