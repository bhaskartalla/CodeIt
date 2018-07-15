package hackerearth;
import java.util.Scanner;

public class GoldMoney
{
    Scanner sc=new Scanner(System.in);
    int N,G;
    int pm[],pg[],c[];
    
    void getdata()
    {
        N=sc.nextInt();
        G=sc.nextInt();
        pm=new int[N];
        pg=new int[N];
        c=new int[N];
        
        for(int i=0;i<N;i++)
        {
            pm[i]=sc.nextInt();
        }
        for(int i=0;i<N;i++)
        {
            pg[i]=sc.nextInt();
        }     
    }
      
    void perform()
    {
        int flag=0,temp=0;
        try{
            System.out.println("Inside perform : ");
            int x,z=0,ind=0;
            for(int i=0;i<N-1;i++)
            {
               x=pg[i];
               for(int j=i+1;j<N;j++)
                {
                    if((x+pg[j])<G)
                    {
                        temp=j;
                        flag=1;
                        x=x+pg[j];
                        ind=ind*10+pg[j];
                        System.out.print("i : "+i+"   j : "+j);
                        System.out.println("   x : "+x+"    \"<\"   temp : "+temp);
                       
                    }
                    else if(x+pg[j]==G)
                    {
                       c[z]=ind*10+pg[j];
                       z++;
                       System.out.print("i : "+i+"   j : "+j);
                       System.out.println("    x : "+x+"    pg["+j+"]: "+pg[j]+"   \"=\"   ");                       
                    }
                    else
                    {
                        System.out.println("i : "+i+"   j : "+j+"   x : "+(x+pg[j])+"   \">\"");
                    }
                   
                    if(flag==1 && j==N-1)
                    {
                        j=temp;
                        flag=0;
                        x=x-pg[j];
                        ind=ind/10;
                        System.out.println("temp : "+temp);
                    }
                }
               System.out.println("i : "+i);
             }
        }catch(Exception E)
        {
            System.out.println("Inside the Exception");
        }
        
    }
    
    void display()
    {
       System.out.println("c.length : "+c.length);
        for(int i=0;i<c.length;i++)
        {
            System.out.println("c["+i+"] : "+c[i]);
        } 
    }
    
    public static void main(String z[])
    {
        GoldMoney G1=new GoldMoney();
        G1.getdata();
        G1.perform();
        G1.display();
    }
}