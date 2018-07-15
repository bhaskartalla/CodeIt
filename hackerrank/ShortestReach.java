package hackerrank;
import java.util.Scanner;
public class ShortestReach 
{
    public static void main(String[] args)
    {        
        Scanner sc=new Scanner(System.in);
        int q=sc.nextInt();
        int n,e,ad[][],l,r,s;
        
        for(int w=0;w<q;w++)
        {
            n=sc.nextInt();
            e=sc.nextInt();
            ad=new int[n+1][n+1];
            
            for(int k=0;k<e;k++)
            {               
                l=sc.nextInt();
                r=sc.nextInt();
                ad[l][r]=6; 
                ad[r][l]=6;
            }
            for(int x=1;x<=n;x++)
            {
                for(int y=1;y<=n;y++)
                {
                   if(x==y)
                   {
                       ad[x][y]=0;
                       continue;
                   }
                   if(ad[x][y]==0)
                   {
                       ad[x][y]=999;
                   }
                }
            }        
            for(int k=1;k<=n;k++)
            {
                for(int i=1;i<=n;i++)
                {
                    for(int j=1;j<=n;j++)
                    {
                        if(ad[i][j]>(ad[i][k]+ad[k][j]))
                        {
                            ad[i][j]=ad[i][k]+ad[k][j];
                        }
                    }
                }
            }   
            s=sc.nextInt();
            
            for(int x=1;x<=n;x++)
            {
                if(s!=x)
                {
                    if(ad[s][x]!=999)
                    {
                       System.out.print(ad[s][x]+" "); 
                    }
                    else
                    {
                        System.out.print("-1 ");
                    }                    
                }
            }
            System.out.println();
        }
    }      
}
