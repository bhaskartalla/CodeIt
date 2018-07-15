package hackerearth;
import java.util.Scanner;

public class Consecutive 
{
    String s[];
    int T;
    Scanner sc = new Scanner(System.in);
    
    Consecutive()
    {}
    
   public static String removeCharAt(String s, int pos) 
   {
      return s.substring(0, pos) + s.substring(pos + 1);
   }
    
    void getdata()
    {
        T=sc.nextInt();
        s=new String[T];  
        
        for(int i=0;i<T;i++)
        {
            s[i]=sc.next();
        }
    }
    
    void perform()
    {
        int l;
        for(int i=0;i<T;i++)
        {
            l=s[i].length();         
            for(int j=0;j<l-1;j++)
            {
                if(s[i].charAt(j)==s[i].charAt(j+1))
                {
                    s[i]=removeCharAt(s[i],j); 
                    j--;                    
                }       
                l=s[i].length();
            }            
        }
    }
    
    void display()
    {
        for(int i=0;i<T;i++)
        {
           System.out.println(s[i]);   
        }
    }      
    
    public static void main(String z[])
    {
        Consecutive C1=new Consecutive();  
        C1.getdata();
        C1.perform();
        C1.display();
    }
    
}
