package hackerrank;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SticksCut
{
    Scanner sc =new Scanner(System.in);
    int N,count=0;
    ArrayList a=new ArrayList();
    
    void getData()
    {
        N=sc.nextInt();
        for(int i=0;i<N;i++)
        {
            a.add(sc.nextInt());
        }        
    }
    
    void perform()
    {
        int q,m;
        while(a.size()>0)
        {
            m=(Integer)Collections.min(a, null);
            for(int i=0;i<a.size();i++)
            {
                q=(Integer)a.get(i)-m;
                a.set(i,q);
                if(a.get(i)=="0")
                {
                    a.remove(i);
                }
                count=count+1;
            }
            System.out.println(count);
        }
    }

    public static void main(String[] z) 
    {
        SticksCut S1=new SticksCut();
        S1.getData();
        S1.perform();
        
    }
}
