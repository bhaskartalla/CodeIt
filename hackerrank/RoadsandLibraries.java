package hackerrank;

import java.util.Scanner;

public class RoadsandLibraries 
{
    static  int S[],top=-1;
    static void push(int n)
    {
        if(top==99998)
        {
            System.out.println("Stack if FULL");
        }
        else
        {
            S[++top]=n;
        }
    }
    
    static int pop()
    {
        if(top==-1)
        {
            System.out.println("Stack if EMPTY");
        }
        else
        {
            return S[top--];
        }
        return 0;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        S=new int[99999];
        for(int q=sc.nextInt();q>0;q--)
        {
            int n=sc.nextInt();
            int m=sc.nextInt();
            int cl=sc.nextInt();
            int cr=sc.nextInt();            
            int mat[][]=new int[n+1][n+1];            
            boolean v[]=new boolean[n+1];
            int s,d,e1=0,e2,z,tot=0,comp=0;
            for(int i=0;i<m;i++)
            {        
                s=sc.nextInt();
                d=sc.nextInt();                
                mat[s][d]=1;
                mat[d][s]=1;             
            } 
            
            if(cr>=cl)
            {
                System.out.println(cl*n);
            }
            else
            {                
                while(e1<n)
                {
                    comp++;
                    e2=0;
                    for(z=1;z<n+1;z++)
                    {
                        if(!v[z])
                        {
                            break;
                        }
                    }
                    v[z]=true;
                    push(z);
                    while(top!=-1)
                    {
                        s=pop();
                        //System.out.print(s+" ");
                        e2++;
                        for(int x=1;x<n+1;x++)
                        {        
                            if(mat[s][x]==1 && !v[x]) 
                            {
                                v[x]=true;
                                push(x);                     
                            }                
                        }            
                    }
                    if(e2==1)
                    {
                        tot+=cl;
                        comp--;
                    }
                    else
                    {
                        tot+=(e2-1)*cr;
                    }                    
                    e1+=e2;                    
                }    
                 System.out.println(tot+comp*cl);
            }           
        }
    }
    
}
