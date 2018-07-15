package hackerrank;


import java.util.Scanner;
public class BotPrincess2
{
    Scanner sc=new Scanner(System.in);
    String s[];
    int N,xm,ym,xp,yp;

   
    
    void getData()
    {
       N=sc.nextInt();
       xm=sc.nextInt();
       ym=sc.nextInt();
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
                if(s[i].charAt(j)=='p')
                {
                    xp=i;
                    yp=j;
                }                
           }
       }
       if((xp-xm)>0 && (xp-xm)!=0)
       {           
           System.out.println("Down");
       }
       else if((xp-xm)!=0)
       {           
           System.out.println("UP");
       }
       else if((yp-ym)>0 && (yp-ym)!=0)
       {
           System.out.println("RIGHT");
       }
       else if((yp-ym)!=0)
       {
           System.out.println("LEFT");
       }       
    }
    public static void main(String[] z) 
    {
        BotPrincess2 B1=new BotPrincess2();
        B1.getData();
        B1.perform();        
    }
}
