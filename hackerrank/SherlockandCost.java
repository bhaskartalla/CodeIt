package hackerrank;
import java.util.*;

public class SherlockandCost {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
     
    Scanner sc=new Scanner(System.in);
        
        int t=sc.nextInt();
        int n[];
        int x,da=0,db=0;
        for(int k=0;k<t;k++)
        {
            
            x=sc.nextInt();
            n=new int[x];
            for(int j=0;j<x;j++)
            {
                n[j]= sc.nextInt();
            }
            
            int sa[]= new int[x];
            int sb[]= new int[x];
            for(int i=0;i<x;i++)
            {
                if(i%2==0)
                {
                    sa[i]=1;
                    sb[i]=n[i];
                }
                else
                {
                    sa[i]=n[i];
                    sb[i]=1;
                }
            }
            for(int j=1;j<x;j++)
            {
                da=da+Math.abs(sa[j]-sa[j-1]);
                db=db+Math.abs(sb[j]-sb[j-1]);
            }
            
            if(da>db)
            {
                System.out.println(da);
            }
            else
            {
                System.out.println(db);
            }
        }
    }
}