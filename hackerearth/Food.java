package hackerearth;
import java.util.Scanner;
import java.util.Stack;

public class Food 
{
    int Q;
    Scanner sc=new Scanner(System.in);
    Stack S1;
    
    Food()
    {
       S1=new Stack(); 
    }
    void perform()
    {
        Q=sc.nextInt();
        for(int i=0;i<Q;i++)
        {
            if(sc.nextInt()==1)
            {
                if(S1.empty())
                {
                    System.out.println("No Food");
                }
                else
                {
                    System.out.println(S1.pop());
                }
            }
            else
            {
                S1.push(sc.nextInt());
            }
        }
    } 
    public static void main(String z[])
    {
        Food F1=new Food();
        F1.perform();
    }   
}
