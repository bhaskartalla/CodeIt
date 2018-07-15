package hackerrank;


import static java.lang.Math.abs;
import java.util.Scanner;
public class BotPrincess 
{
    Scanner sc=new Scanner(System.in);
    char c[][];
    String s[];
    int N,xm,ym,xp,yp;
    
    void getData()
    {
       N=sc.nextInt();
       s=new String[N];
       for(int i=0;i<N;i++)
       {
           s[i]=sc.next();
       }
    }
    
    void perform()
    {
       for(int i=0;i<N;i++)
       {
           for(int j=0;j<N;j++)
           {
                if(s[i].charAt(j)=='m')
                {
                    xm=i;
                    ym=j;
                }
                if(s[i].charAt(j)=='p')
                {
                    xp=i;
                    yp=j;
                }                
           }
       }
       if((xp-xm)>0)
       {
           for(int i=0;i<abs(xp-xm);i++)
           {
             System.out.println("Down");
           }
       }
       else
       {
           for(int i=0;i<abs(xp-xm);i++)
           {
             System.out.println("UP");
           }
       }
       if((yp-ym)>0)
       {
           for(int i=0;i<abs(yp-ym);i++)
           {
             System.out.println("RIGHT");
           }
       }
       else
       {
           for(int i=0;i<abs(yp-ym);i++)
           {
             System.out.println("LEFT");
           }
       }
       
    }
    
    public static void main(String[] z) 
    {
        BotPrincess B1=new BotPrincess();
        B1.getData();
        B1.perform();        
    }
}
