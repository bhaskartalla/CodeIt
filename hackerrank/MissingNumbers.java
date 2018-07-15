package hackerrank;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Scanner;
public class MissingNumbers
{
    Scanner sc=new Scanner(System.in);
    int n, m, a[],b[];
    ArrayList a1=new ArrayList();
    void getdata()
    {
        n=sc.nextInt();
        a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        m=sc.nextInt();
        b=new int[m];
        for(int i=0;i<m;i++)
        {
            b[i]=sc.nextInt();
        }
    }
    void perform()
    {
        for(int i=0;i<n;i++)
        {
            if(freqA(a[i])!=freqB(a[i]))
            {
                a1.add(a[i]);           
            }            
        }  
        Collections.sort(a1);
        a1 = new ArrayList(new LinkedHashSet<>(a1));
        for (Object a11 : a1) {
            System.out.print(a11 + " ");
        }
        
    }
    int freqA(int x)
    {
        int c=0;
        for(int j=0;j<n;j++)
        {
            if(x==a[j])
            {
                c++;
            }
        }
        return c;
    }
    
    int freqB(int x)
    {
        int c=0;
        for(int j=0;j<m;j++)
        {
            if(x==b[j])
            {
                c++;
            }
        }
        return c;
    }
    
    public static void main(String[] z) 
    {
        MissingNumbers M1=new MissingNumbers();
        M1.getdata();
        M1.perform();                                        
    }
}
