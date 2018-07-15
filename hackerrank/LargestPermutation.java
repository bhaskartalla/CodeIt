package hackerrank;

import java.util.Scanner;

public class LargestPermutation 
{
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int a[]=new int[n];
        
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
//        int max,pos,temp,j;
//        for(int i=0;i<k;i++)
//        {
//            max=0;
//            pos=0;
//            for(j=i;j<n;j++)
//            {
//                if(max<a[j])
//                {
//                    max=a[j];
//                    pos=j;
//                }
//            }
//            temp=a[i];
//            a[i]=a[pos];
//            a[pos]=temp;             
//        }
        
        int temp=0,j;
        
        for(int i=0;i<n;i++)
        {
            if(a[i]!=n-i && k!=0)
            {
                j=i+1;
                while(a[j]!=n-i)
                j++;
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                k--;
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        } 
        
    }
}
