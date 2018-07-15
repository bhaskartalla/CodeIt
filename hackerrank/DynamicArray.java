package hackerrank;

import java.util.LinkedList;
import java.util.Scanner;

public class DynamicArray
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int q=sc.nextInt();        
        LinkedList<Integer> l[]=new LinkedList[n];
        int z=0,x=0,y=0,la=0,ind=0,ob=0;
        
        for(int i=0;i<q;i++)
        {
            z=sc.nextInt();
            x=sc.nextInt();
            y=sc.nextInt();
            if(z==1)
            {
                ind=(x^la)%n;
                if(l[ind]!=null)
                {
                    l[ind].add(y);
                }
                else
                {
                    l[ind] = new LinkedList<Integer>();
                    l[ind].add(y);
                }
                
            }
            else
            {
                ind=(x^la)%n;
                la=l[ind].get(y%(l[ind].size()));
                System.out.println(la);               
            }
        }
        
        
        
        
    }
}




