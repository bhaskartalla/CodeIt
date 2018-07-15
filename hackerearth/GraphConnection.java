package hackerearth;
import java.util.Scanner;

public class GraphConnection 
{
    int N,K,x;
    int mat[][],mat1[][];
    Scanner sc=new Scanner(System.in);
    
    GraphConnection()
    {
        N=sc.nextInt();
        mat=new int[N][N];
        
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++)
            {
                mat[i][j]=0;
            }
        }
    }
    void getdata()
    {
        int a,b;
        K=sc.nextInt();
        for(int i=0;i<K;i++)
        {
            a=sc.nextInt();
            b=sc.nextInt();
            mat[a][b]=1;
            mat[b][a]=1;            
        }  
        x=sc.nextInt();
    }
    
    
    void perform()
    {
        mat1=new int[N-1][N-1];
        int m=0,n=0;
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++)
            {
                if(i!=x && j!=x)
                {
                   mat1[m][n]=mat[i][j]; 
                }
            }
             System.out.println(); 
        }
        
        if(isConnected())
        {
           System.out.println("Connected"); 
        }
        else
        {
           System.out.println("Not Connected"); 
        }
    }
    
    boolean isConnected()
    {  
        for(int i=0;i<N-1;i++)
        {
            for(int j=0;j<N-1;j++)
            {
                 System.out.print(mat1[i][j]+"   "); 
            }
             System.out.println(); 
        }    
        
        int flag=0;
        for(int i=0;i<N;i++)
        {
            flag=0;
            for(int j=0;j<N;j++)
            {
                if(mat[i][j]!=0)
                {
                    flag=1;                   
                }               
            }
            if(flag==0)
            {
                break;    
            }
        }
        if(flag==0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    
    public static void main(String z[])
    {
        GraphConnection G1=new GraphConnection();
        G1.getdata();
        G1.perform();
        
    }
    
    
    
}
