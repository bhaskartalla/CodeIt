////package hackerearth;
////
////import java.util.Collections;
////import java.util.Scanner;
////
////public class SamuandShopping 
////{
////     int price[][];
////     int cah[][];
////     int n;
////    
////     void getData()
////     { 
////        Scanner sc=new Scanner(System.in);
////        for(int i=sc.nextInt();i>0;i--)
////        {
////            n=sc.nextInt();
////            price=new int[n][3];
////            cah=new int[n][3];
////            
////            for(int j=0;j<n;j++)
////            {
////                for(int k=0;k<3;k++)
////                {
////                    price[j][k]=sc.nextInt();
////                }
////            }  
////            for(int j=0;j<n;j++)
////            {
////                for(int k=0;k<3;k++)
////                {
////                    cah[j][k]=-1;
////                }
////            }
////        }  
////        //System.out.println(Math.max(F(0,0), Math.min(F(0,1),F(0,2))));
////        System.out.println(F(0,0));
////     }
////     
//////    int F(int shop,int item)
//////    {
//////        if(shop==n-1)
//////        {
//////            return price[shop][item];
//////        }
//////        else if(cah[shop][item]!=-1)
//////        {
//////            return cah[shop][item];
//////        }
//////        else
//////        {
//////            switch(item)
//////            {
//////                case 0:
//////                    cah[shop+1][1]=F(shop+1,1);
//////                    cah[shop+1][2]=F(shop+1,2);
//////                    return cah[shop][item]=price[shop][item]+Math.min(cah[shop+1][1],cah[shop+1][2]);              
//////                case 1:
//////                   cah[shop+1][0]=F(shop+1,0);
//////                   cah[shop+1][2]=F(shop+1,2);
//////                   return cah[shop][item]=price[shop][item]+Math.min(cah[shop+1][0],cah[shop+1][2]); 
//////                case 2:
//////                   cah[shop+1][1]=F(shop+1,1);
//////                   cah[shop+1][0]=F(shop+1,0);
//////                   return cah[shop][item]=price[shop][item]+Math.min(cah[shop+1][1],cah[shop+1][0]);                    
//////            }
//////        }
//////        return 0;
//////    }
////        int ans;
////        int F(int shop,int item)
////        {
////            if(shop==n)
////                return 0;
////            ans=2147483647; 
////            for(int i=0;i<3;i++)
////            {
////                if(i!=item)
////                {
////                    ans=Math.min(ans,price[shop][i]+F(shop+1,i));                    
////                }
////            }
////            return ans;
////        }
////   
////    
////    public static void main(String[] args)
////    {
////       SamuandShopping S1=new SamuandShopping();
////       S1.getData();
////    } 
////}
////
////
////
//
//import java.util.*;
//
//
//public class asd1
//{   
//    int n,u,v,mat[][],cap[],ngh[],uncap[],count=0,min=2147483647,p[],c[],pos=0;
//    boolean iscap[];
//    void getdata()
//    {
//        Scanner sc = new Scanner(System.in);
//        
//        for(int t=sc.nextInt();t>0;t--)
//        {
//            n=sc.nextInt();
//            count=n;
//            cap=new int[n+1];
//            uncap=new int[n+1];
//            ngh=new int[n+1];
//            p=new int[n+1];
//            c=new int[n+1];
//            iscap=new boolean[n+1];
//            
//            mat=new int[n+1][n+1];
//            for(int i=0;i<n+1;i++)
//            {
//                for(int j=0;j<n+1;j++)
//                {
//                    mat[i][i]=0;
//                }  
//            }
//            for(int i=1;i<n;i++)
//            {
//                u=sc.nextInt();
//                v=sc.nextInt();                
//                mat[u][v]=1;
//                ngh[u]+=1;
//                ngh[v]+=1;                  
//            }    
//            for(int i=1;i<n;i++)
//            {
//                p[i]=sc.nextInt();
//            } 
//            for(int i=1;i<n;i++)
//            {
//                c[i]=sc.nextInt();                 
//            } 
//            uncap=ngh;
//            
//            while(count>0)
//            {
//                for(int i=1;i<=n;i++)
//                { 
//                    if(min>p[i])
//                    {
//                        min=p[i];
//                        pos=i;
//                    }
//                }
//                uncap[pos]-=1;
//                cap[pos]+=1;
//                count--;
//                iscap[pos]=true;
//                perform(pos);
//                
//            }
//            
//             for(int i=0;i<n+1;i++)
//            {
//                for(int j=0;j<n+1;j++)
//                {
//                    System.out.print(mat[i][i]);
//                } 
//                System.out.println();
//            } 
//        }
//        
//    }
//    
//    void perform(int pos)
//    {
//        for(int i=1;i<=n;i++)
//        {
//            if(mat[pos][i]==1 && iscap[i]==false)
//            {
//                if(c[i]<=cap[i])
//                {
//                    continue;
//                }
//                else
//                {
//                    
//                }
//            }
//        }
//    }
//    
//    public static void main(String[] args)
//    {
//        asd1 A=new asd1();
//        A.getdata();
//        
//    }
//}
//
//


import java.util.*;

public class asd1
{
    static boolean check(int mat[][],int n,int m)
    {
        int x=mat[0][0];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(x!=mat[i][j])
                {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        for(int t=sc.nextInt();t>0;t--)
        {
            int n=sc.nextInt();
            int m=sc.nextInt();
            int mat[][]=new int[n][m];
            
            int hrs=0;
            
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                {
                    mat[i][j]=sc.nextInt();
                }
            }
            while(check(mat,n,m))
            {
                hrs++;
                for(int i=0;i<n;i++)
                {
                    for(int j=0;j<m;j++)
                    {                    
                        if(i!=0 && mat[i-1][j]<mat[i][j])
                        {
                            mat[i-1][j]=mat[i][j];                        
                        }
                        if(i!=n-1 && mat[i+1][j]<mat[i][j])
                        {
                            mat[i+1][j]=mat[i][j];                        
                        }
                        if(j!=0 && mat[i][j-1]<mat[i][j])
                        {
                            mat[i][j-1]=mat[i][j];                        
                        }
                        if(j!=n-1 && mat[i][j+1]<mat[i][j])
                        {
                            mat[i][j+1]=mat[i][j];                        
                        }
                        if(i!=0 && j!=0 && mat[i-1][j-1]<mat[i][j])
                        {
                            mat[i-1][j-1]=mat[i][j];                        
                        }
                        if(i!=0 && j!=n-1 && mat[i-1][j+1]<mat[i][j])
                        {
                            mat[i-1][j+1]=mat[i][j];                        
                        }
                        if(i!=n-1 && j!=0 && mat[i+1][j-1]<mat[i][j])
                        {
                            mat[i+1][j-1]=mat[i][j];                        
                        }
                        if(i!=n-1 && j!=n-1 && mat[i+1][j+1]<mat[i][j])
                        {
                            mat[i+1][j+1]=mat[i][j];                        
                        }                  
                    }
                }
            }
            System.out.println(hrs);           
        }
    }
}