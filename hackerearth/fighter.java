
import java.lang.*;
import java.util.*;

public class fighter
{
    Scanner sc = new Scanner(System.in);
    int N,Q,z,ind;
    int n[],qq[],a[];
    
    fighter()
    {  }   
    void getdata()
    {
        int f=0;
        N=sc.nextInt();
        Q=sc.nextInt();
       
        n=new int[N]; 
        qq=new int[Q];
        a=new int[N];
              
        for(int i=0;i<N;i++)
        {
            n[i]=sc.nextInt();
            a[i]=1;
        }
        for(int i=0;i<Q;i++)
        {
            qq[i]=sc.nextInt();
        }    
        perform(n);
    }
    
    int index(int p)
    {
        for(int j=0;j<N;j++)
        {
            if(n[j]==p)
            {
              ind=j; 
            }
        } 
        return(ind); 
    }
    
    void perform(int q[])
      {
          z=0;
          int x[],qlen;
          try{               
              if(q.length%2==0)
              {
                  x=new int[(q.length)/2];
                  qlen=q.length;                  
              }
              else
              {
                   x=new int[((q.length)/2)+1];
                   qlen=q.length-1;
                   x[(x.length)-1]=q[(qlen)];         
              }
              
                  for(int i=0;i<qlen;i=i+2)
                  {
                      if(q[i]>q[i+1])
                        {
                            x[z]=q[i];
                            z++;
                            a[index(q[i])]++;
                        }
                        else
                        {
                             x[z]=q[i+1];
                             z++;
                             a[index(q[i+1])]++;
                        }
                   }         
            if(x.length==2)
            {
                display();
            }
            else
            {
                perform(x);  
            } 
          }catch(Exception e){}
      } 
    void display()
    {
        for(int i=0;i<Q;i++)
        {
            System.out.println(a[qq[i]-1]+" ");
        }
    }   
    public static void main(String z[])
    {
        fighter F1=new fighter();
        F1.getdata();
    }
}


//******************************************************************************
//OUTPUT
//8 8
//1 2 3 4 5 6 7 8
//1
//2
//3
//4
//5
//6
//7
//8
//******************************************************************************