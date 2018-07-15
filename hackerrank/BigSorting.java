import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class BigSorting
{
//    static void insertionSort(BigInteger a[],int n)
//    {
//        int j=0;
//        BigInteger temp;
//        for(int i=1;i<n;i++)
//        {
//            temp=a[i];
//            j=i-1;
//            while(j>=0 && a[j].compareTo(temp)>0)
//            {
//                a[j+1]=a[j];
//                j--;
//            }
//            a[j+1]=temp;                  
//        }
//        for(int i=0;i<n;i++)
//        {
//            System.out.println(a[i]+" ");
//        }
//    }

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        BigInteger a[]=new BigInteger[n];
        for(int i=0;i<n;i++)
        {
            a[i]=new BigInteger(sc.next());
        }
        Arrays.sort(a);
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]+" ");
        }
    }
}
