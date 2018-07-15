package hackerearth;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class LuckyNo 
{
    Scanner sc=new Scanner(System.in);
    int n;
    Stack st=new Stack();
    void perform()
    {    
        int pp,flag=0;
        st.push(4);
        n=sc.nextInt();
        while(st.size()<n)
        {
            if(sumStack()==n || n==7)
            {
                System.out.println("Lucky No.");
                flag=1;
                break;
            }
            else if(sumStack()<n)
            {
                st.push(4);
            }
            else
            {
               st.pop();
               pp=(int)st.pop();
               if(pp==7)
               {
                   st.pop();      
               }
               st.push(7);
            }
        }
        if(flag!=1)
        {
            System.out.print("Not a Lucky No.");
        }
        
    }
    
    int sumStack()
    {
        int sum=0;
        Iterator iter = st.iterator();
        while (iter.hasNext())
        {
            sum=sum + (int)iter.next();
        }
        return sum;
    }
    
    public static void main(String z[])
    {
        LuckyNo L1=new LuckyNo();
        L1.perform();
    }
    
}
