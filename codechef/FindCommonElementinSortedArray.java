package codechef;


import java.util.Scanner;

public class FindCommonElementinSortedArray
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n1=sc.nextInt();
        int a1[]=new int[n1];
        for(int i=0;i<n1;i++)
        {
            a1[i]=sc.nextInt();
        }        
        int n2=sc.nextInt();
        int a2[]=new int[n2];
        for(int i=0;i<n2;i++)
        {
            a2[i]=sc.nextInt();
        }        
        int n3=sc.nextInt();
        int a3[]=new int[n3];
        for(int i=0;i<n3;i++)
        {
            a3[i]=sc.nextInt();
        }
        
        int i=0,j=0,k=0;
        
        while(i<n1 && j<n2 && k<n3)
        {
            if(a1[i]==a2[j] && a2[j]==a3[k])
            {
                System.out.print(a1[i]+" ");
                i++;
                j++;
                k++;
            }
            else if(a1[i]<a2[j])
            {
                i++;
            }
            else if(a2[j]<a3[k])
            {
                j++;
            }
            else 
            {
                k++;
            }
        }
        
    }
}














//3
//1 5 5
//5
//3 4 5 5 10
//4
//5 5 10 20
//
//
//
//6
//1 5 10 20 40 80
//5
//6 7 20 80 100
//8
//3 4 15 20 30 70 80 120


