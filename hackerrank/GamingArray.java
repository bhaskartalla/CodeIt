package hackerrank;
import java.util.Scanner;
import java.util.Stack;
public class GamingArray 
{
    Scanner sc= new Scanner(System.in);
    int g,n,x=0,e;
    long a[];
    final int s=0;
    
    void perform()
    {
       boolean bob=true,andy=false;
       g=sc.nextInt();
       for(int i=0;i<g;i++)
        {
            n=sc.nextInt();
            a=new long[n];
            e=n-1;
            for(int j=0;j<n;j++)
            {
                a[j]=sc.nextLong();
            }
            while(x>=0)
            {        
                bob=(x%2==0)?true:false;
                andy=(x%2!=0)?true:false;
                x++;
                e=max(s,e)-1;
                if(s>=e )
                {                   
                    break;
                }               
            }
            if(bob)
            {
                System.out.println("BOB");
            }
            else if(andy)
            {
                System.out.println("ANDY");
            }  
        }       
    }
    
    int max(int x,int y)
    {
        int p=0,i;long temp=0;
        for(i=x;i<=y;i++)
        {
            if(temp<a[i])
            {
                temp=a[i];
                p=i;
            }
        }
        return p;
    }
    
   
    public static void main(String[] args)
    {     
        GamingArray G1=new GamingArray();
        G1.perform();
    }    
}


//
//import java.util.Scanner;
//import java.util.Stack;
//public class GamingArray 
//{
//    public static Integer max(Stack stack)
//    {
//    if (stack.isEmpty()) {
//        return Integer.MIN_VALUE;
//    }
//    else {
//        Integer last = (Integer)stack.pop();
//        Integer next = max(stack);
//        stack.push(last);
//        if (last > next) {
//            return last;
//        }
//        else {
//            return next;
//        }            
//    }
//    }
//    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        Stack st=new Stack();
//        int g=sc.nextInt();
//        int n;
//        boolean bob=true,andy=false;
//        for(int i=0;i<g;i++)
//        {
//            n=sc.nextInt();
//            for(int j=0;j<n;j++)
//            {
//                st.push(sc.nextInt());
//            }
//            int x=0;
//            while(x>=0)
//            {        
//                bob=(x%2==0)?true:false;
//                andy=(x%2!=0)?true:false;
//                x++;
//                int m=max(st);
//                while((int)st.pop()!=m)
//                { }
//                if(st.isEmpty())
//                {                   
//                    break;
//                }               
//            }
//            if(bob)
//            {
//                System.out.println("BOB");
//            }
//            else if(andy)
//            {
//                System.out.println("ANDY");
//            }  
//        }
//    }
//    
//}