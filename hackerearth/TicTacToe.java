
import java.util.*;

class P2
{    
    public static void main(String z[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int n[]=new int[t];
        int fb[];
        
        for(int i=0;i<t;i++)
        {
            n[i]=sc.nextInt();
        }        
        
        int sum=0;
        
        for(int i=0;i<t;i++)
        {
            int a=0,b=1,c=0;
            fb=new int[n[i]];
            fb[0]=a;
            fb[1]=b;
            for(int k=2;k<n[i];k++)
            {
               c=a+b;
               a=b;
               b=c; 
               fb[k]=c;
            }           
            for(int k=0;k<n[i];k++)
            {
                int beg=0,end=fb.length,mid,flag=0;               
                while(beg<=end)
                {
                 mid=(beg+end)/2;
                 if(k==mid)
                 {
                     flag=1;
                     break;
                 }
                 else if(k>mid)
                 {
                     beg=mid+1;
                 }
                 else
                 {
                     end=mid-1;
                 }
                }
                if(flag==0)
                {
                   sum=sum+k;
                }
            }
             if(sum%2==0)
            {
                System.out.println("Tac   "+"sum : "+sum);  
            }
            else
            {
               int flag=0;       
               for(int j=2;j<=sum/2;j++)
               {    
                    if(sum%j==0)
                    {      
                    flag=1;    
                    break;    
                    }    
               }
               
               if(flag==0)
               {
                   System.out.println("Tic");
               }
               else
               {
                  System.out.println("Toe"); 
               }
            }          
        }
    }
}
