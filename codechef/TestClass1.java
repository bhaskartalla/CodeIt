package codechef;

//
//import java.util.Scanner;
//
//
//public class Solution
//{
//    public static void main(String[] args)
//    {
//        Scanner sc = new Scanner(System.in);
//        int n=sc.nextInt();
//        int a[]=new int[n];
//        int max=0,p=0,ans=1;
//        
//        for(int i=0;i<n;i++)
//        {
//            a[i]=sc.nextInt();
//            if(max<a[i])
//            {
//                max=a[i];
//                p=i;
//            }
//        }    
//        ans*=a[p];
//        max=0;
//        int x=p-1;
//        for(int i=0;i<=x;i++)
//        {          
//            if(max<a[i])
//            {
//                max=a[i];
//                p=i;
//            }
//        }
//        ans*=a[p];
//        max=0;
//        x=p-1;
//        for(int i=0;i<=x;i++)
//        {          
//            if(max<a[i])
//            {
//                max=a[i];
//                p=i;
//            }
//        }
//        ans*=a[p];
//        System.out.println(ans);
//    }
//}







// Java program to illustrate String with unique
// characters without using any data structure
import java.util.*;
 
class GfG
{
    boolean uniqueCharacters(String str)
    {
        // Assuming string can have characters a-z
        // this has 32 bits set to 0
        int checker = 0;
 
        for (int i=0; i<str.length(); i++)
        {
            int bitAtIndex = str.charAt(i)-'a';
 
            // if that bit is already set in checker,
            // return false
            if ((checker & (1<<bitAtIndex)) > 0)
            {
                System.out.println((char)bitAtIndex);
                return false;
            }
                
 
            // otherwise update and continue by
            // setting that bit in the checker
            checker = checker | (1<<bitAtIndex);
        } 
        // no duplicates encountered, return true
        return true;
    }    
 
    // Driver Code
    public static void main(String args[])
    {
        
        
//        System.out.println(x+">>>"+y+"          : "+(x<<y));
//        System.out.println("Binary "+x+"       : "+Integer.toBinaryString(x));
//        System.out.println("Binary "+y+"        : "+Integer.toBinaryString(y));
//        System.out.println("Binary "+x+">>>"+y+"   : "+Integer.toBinaryString((x>>>y)));
        
    
        
        
        GfG obj = new GfG();
        String input = "asdf";
 
        if (obj.uniqueCharacters(input))
            System.out.println("unique");
        else
            System.out.println("duplicate");        
        
    }
}


