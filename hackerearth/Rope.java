package hackerearth;
import java.util.Arrays;
import java.util.Scanner;

class Rope
{
int T,L,c=1,flag=1,a,ans=0;
int l[],u[],d[];

Scanner sc = new Scanner(System.in);
    Rope()
    {
     T=sc.nextInt();
     l=new int[T];
     
      for(a=0;a<T;a++)
      {
         l[a]=sc.nextInt();
         u=new int[l[a]];  
         d=new int[l[a]];
         
         for(int k=0;k<l[a];k++)
         {
            u[k]=sc.nextInt();
         }
         for(int k=0;k<l[a];k++)
         {
            d[k]=sc.nextInt();
         } 
         
        Arrays.sort(u);
        Arrays.sort(d);
        
        for(int i=0;i<l[a];i++)
        {
            ans=ans+u[i]*d[i];
        }
         
       }     
    }    
     void dispaly()
     {
         System.out.println(ans);       
     }
    public static void main(String z[])
    {
        Rope R1=new Rope();  
        R1.dispaly();
    }
}