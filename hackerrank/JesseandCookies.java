
package hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

//public class JesseandCookies
//{
//    public static void main(String[] args)
//    {
//        Scanner sc = new Scanner(System.in);
//        
//        int n=sc.nextInt();
//        int k=sc.nextInt();
//        
//        ArrayList<Integer> na = new ArrayList<Integer>(n);    
//        
//        for(int i=0;i<n;i++)
//        {
//            na.add(sc.nextInt());
//        }
//        
//        int op=0;
//        
//        while(na.get(0)<k)
//        {
//            Collections.sort(na);
//            na.add(0, na.remove(0)+2*na.remove(0));
//            op++;
//        }
//        System.out.println(op);
//    }
//}



import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JesseandCookies {

    static String reverse(String s) 
    {
        if(s.length()<=1)
        {
            return s;
        }
        else
        {
            return reverse(s.substring(1))+s.charAt(0);
        }  
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(reverse("bhaskar"));
    }
}
