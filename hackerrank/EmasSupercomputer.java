package hackerrank;
import java.util.Scanner;
public class EmasSupercomputer 
{
    Scanner sc=new Scanner(System.in);
    int n,m,a1=0,a2=0;  
    char mat[][];
    void getdata()
    {
        n=sc.nextInt();
        m=sc.nextInt();
        mat=new char[n][m];
        String s;
        for(int i=0;i<n;i++)
        {
            s=sc.next();
            for(int j=0;j<m;j++)
            {
                mat[i][j]=s.charAt(j);
            }   
        }
    }
    void perform()
    {
        int A=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(mat[i][j]=='G') 
                {
                    if((i==1 && j==1) || (i==3 && j==2))
                    {
                        System.out.println();
                    }
                    A=area(i,j);
                    if(a1<(A*4+1))
                    {
                        a2=a1;
                        a1=(A*4+1);
                    }
                }
            }   
        }        
        System.out.print(a1*a2);         
    }   
    int area(int x,int y)
    {
        int len=0,z=1,flag=0;
        if(x<=y && x<=(n-x-1) && x<=(m-y-1))
        {   len=x;        }
        else if(y<=x && y<=(n-x-1) && y<=(m-y-1))
        {   len=y;        }
        else if((n-x-1)<=y && (n-x-1)<=x && (n-x-1)<=(m-y-1))
        {   len=(n-x-1);    }
        else if((m-y-1)<=y && (m-y-1)<=x && (m-y-1)<=(n-x-1))
        {   len=m-y-1;    }
        
        while(len>=z)
        {
            flag=1;
            if(mat[x][y+z]=='G' && mat[x][y-z]=='G' && mat[x+z][y]=='G' && mat[x-z][y]=='G')
            {
                z++;
            }
            else
            {
                break;
            }
        }
        if(flag==1)
        {
            return z-1; 
        }
        else
        {
            return z; 
        }              
    }
    public static void main(String[] z)
    {
        EmasSupercomputer E1=new EmasSupercomputer();
        E1.getdata();
        E1.perform(); 
    }      
}
