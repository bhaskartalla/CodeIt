
import java.util.Scanner;
public class LongestIncreasingPath
{
    static int a[][],n,m,mem[][];    

    
 /****************************************************TOP DOWN**********************************************************/
   
//    static int find(int x,int y)
//    {
//        if((x==n-1 && y==m-1))
//        {
//            return 1;
//        }
//        else if(x<n-1 && y<m-1 && a[x+1][y]>a[x][y] && a[x][y+1]>a[x][y])
//        {
//            return Math.max(find(x+1,y),find(x,y+1))+1;
//        }
//        else if(x<n-1 && a[x+1][y]>a[x][y])
//        {
//            return find(x+1,y)+1;
//        }
//        else if(y<m-1 && a[x][y+1]>a[x][y])
//        {
//            return find(x,y+1)+1;
//        }
//        return 1;
//    } 
//    
/****************************************************BOTTOM UP**********************************************************/
   
    static int find(int x,int y)
    {
        for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                {
                    mem[i][j]=1;
                }
            }         
        for(int i=x-1;i>=0;i--)  
        {
            for(int j=y-1;j>=0;j--)
            {
                if(i==x-1 && j!=y-1 && a[i][j+1]>a[i][j])
                {                
                  mem[i][j]=mem[i][j+1]+1;                                  
                }
                else if(j==y-1 && i!=x-1 && a[i+1][j]>a[i][j])
                {
                    mem[i][j]=mem[i+1][j]+1;
                } 
                else if((i<x-1 && a[i+1][j]>a[i][j]) && (j<y-1 && a[i][j+1]>a[i][j]))
                {
                    mem[i][j]=Math.max(mem[i][j+1],mem[i+1][j])+1;
                }
                else if(i<x-1 && a[i+1][j]>a[i][j])
                {
                    mem[i][j]=mem[i+1][j]+1;
                }
                else if(j<y-1 && a[i][j+1]>a[i][j])
                {
                   mem[i][j]=mem[i][j+1]+1; 
                }
            }
        }
       return mem[0][0]; 
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        for(int t=sc.nextInt();t>0;t--)
        {
            n=sc.nextInt();
            m=sc.nextInt();
            a=new int[n][m];
            mem=new int[n][m];
            
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                {
                    a[i][j]=sc.nextInt();
                }
            }            
            System.out.println(find(n,m));
        }
        
    }
}


