package hackerrank;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class EqualStacks 
{
//    static boolean binarySearch(int x ,int arr[])
//    {
//        int b=0,m=0,e=arr.length-1;
//        while(b<=e)
//        {
//            m=(b+e)/2;
//            if(x==arr[m])
//            {
//                return true;
//            }
//            else if(x>arr[m])
//            {
//                b=m+1;
//            }
//            else
//            {
//                e=m-1;
//            }
//        }
//        return false;
//    }
//    public static void main(String[] args)
//    {
//        Scanner sc = new Scanner(System.in);
//        int st1=sc.nextInt();
//        int st2=sc.nextInt();
//        int st3=sc.nextInt();
//        
//        int stk1[]=new int[st1];
//        int stk2[]=new int[st2];
//        int stk3[]=new int[st3];
//        
//        int s1=0,s2=0,s3=0;
//        
//        for(int i=0;i<st1;i++)
//        {
//            stk1[i]=sc.nextInt();
//            s1+=stk1[i];
//        }
//        for(int i=0;i<st2;i++)
//        {
//            stk2[i]=sc.nextInt();
//            s2+=stk2[i];
//        }
//        for(int i=0;i<st3;i++)
//        {
//            stk3[i]=sc.nextInt();
//            s3+=stk3[i];
//        }        
//        
//        int ss1[]=new int[st1];
//        int ss2[]=new int[st2];
//        int ss3[]=new int[st3];
//        
//        ss1[0]=stk1[st1-1];
//        for(int i=1;i<st1;i++)
//        {
//            ss1[i]=ss1[i-1]+stk1[st1-i-1];            
//        }
//        ss2[0]=stk2[st2-1];
//        for(int i=1;i<st2;i++)
//        {
//            ss2[i]=ss2[i-1]+stk2[st2-i-1];
//        }
//        ss3[0]=stk3[st3-1];
//        for(int i=1;i<st3;i++)
//        {
//            ss3[i]=ss3[i-1]+stk3[st3-i-1];
//        } 
//        
//        if(st1<st2 && s1<st3)
//        {
//            for(int i=0;i<s1;i++)
//            {
//                if(binarySearch(ss1[st1-1-i],ss2) && binarySearch(ss1[st1-1-i],ss3))
//                {
//                    System.out.println(ss1[i]);
//                    break;
//                }
//            }
//        }
//        else if(st2<st1 && st2<st3)
//        {
//            for(int i=0;i<s2;i++)
//            {
//                if(binarySearch(ss2[st2-1-i],ss1) && binarySearch(ss2[st2-1-i],ss3))
//                {
//                    System.out.println(ss2[i]);
//                    break;
//                }
//            }
//        }
//        else
//        {
//            for(int i=0;i<s1;i++)
//            {
//                if(binarySearch(ss3[st3-1-i],ss2) && binarySearch(ss3[st3-1-i],ss1))
//                {
//                    System.out.println(ss3[i]);
//                    break;
//                }
//            }
//        }
//    }
//    
//}


//
//import java.util.Scanner;
//public class EqualStacks 
//{
//    public static void main(String[] args)
//    {
//        Scanner sc = new Scanner(System.in);
//        int st1=sc.nextInt();
//        int st2=sc.nextInt();
//        int st3=sc.nextInt();
//        
//        int stk1[]=new int[st1];
//        int stk2[]=new int[st2];
//        int stk3[]=new int[st3];
//        
//        int s1=0,s2=0,s3=0;
//        
//        for(int i=0;i<st1;i++)
//        {
//            stk1[i]=sc.nextInt();
//            s1+=stk1[i];
//        }
//        for(int i=0;i<st2;i++)
//        {
//            stk2[i]=sc.nextInt();
//            s2+=stk2[i];
//        }
//        for(int i=0;i<st3;i++)
//        {
//            stk3[i]=sc.nextInt();
//            s3+=stk3[i];
//        }
//        
//        int max=0;
//        int i=0,j=0,k=0;
//        
//        while(true)
//        {
//            if(s1==s2 && s1==s3)
//            {
//                System.out.println(s1);
//                break;
//            }
//            else
//            {
//                if(s1>s2 && s1>s3)
//                {
//                    s1-=stk1[i];
//                    i++;
//                }
//                if(s2>s1 && s2>s3)
//                {
//                    s2-=stk2[j];
//                    j++;
//                }
//                if(s3>s1 && s3>s2)
//                {
//                    s3-=stk3[k];
//                    k++;
//                }                
//            }
//        }      
//    }
//}




public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n1 = in.nextInt();
    int n2 = in.nextInt();
    int n3 = in.nextInt();
    int[] numberOfCylinders = {n1, n2, n3};
    
    int[][] stack = {new int[n1], new int[n2], new int[n3]};
    int[] height = {0, 0, 0}; 
    
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < numberOfCylinders[i]; j++) {
            int cylinderHeight = in.nextInt();
            stack[i][j] = cylinderHeight;
            height[i] += cylinderHeight;
        }   
    }
    
    int[] index = {0, 0, 0};
    
    int targetHeight = Math.min(Math.min(height[0], height[1]), height[2]);
    
    while (height[0] != height[1] || height[1] != height[2]) {
        for (int i = 0; i < 3; i++) {
            if (height[i] > targetHeight) {
                height[i] -= stack[i][index[i]++]; 
                targetHeight = Math.min(targetHeight, height[i]);
            }
        }
    }
    System.out.println(targetHeight);
}  
}