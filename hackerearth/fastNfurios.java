package hackerearth;
import java.util.*;

class truck {
    
   int chk;
   int dom[];
   int brn[];
  Scanner sc=new Scanner( System.in); 
     truck()
     {
      
      chk=sc.nextInt();
      dom=new int[chk];
      brn=new int[chk];
      
      for(int i=0;i<chk;i++)
      {
          dom[i]=sc.nextInt();
      }
      for(int i=0;i<chk;i++)
      {
          brn[i]=sc.nextInt();
      }
          
     }
     
     void fun()
     {
       int m,mx=0;
      
         for(int k=0;k<chk-1;k++)
         {
              if(dom[k+1]>dom[k])
              {
               m =dom[k+1]-dom[k];
              }
              else
              {
               m =dom[k]-dom[k+1];
              }
            if(m>mx)
            {
                mx=m;
            }
         }
         
         int n,nx=0;
         for(int k=0;k<chk-1;k++)
         {
             if(brn[k+1]>brn[k])
             {    
               n=brn[k+1]-brn[k];
             }
             else
             {
                n=brn[k]-brn[k+1];
             }
             
            if(n>nx)
            {
                nx=n;
            }
         }
       
         if(nx>mx)
         {
            System.out.println("Brain \n"+nx);
         }
         else 
         {
             if(nx==mx)
             {
               System.out.println("Tie");
             }
             else
             {
               System.out.println("Dom \n"+mx);
             }
         }
     
     
     }
    
    
    public static void main(String args[] ) throws Exception {
      
     truck T1=new truck();
     T1.fun();      
    }
}

//******************************************************************************
//OUTPUT
//3
//1 2 3
//1 2 4
//******************************************************************************
