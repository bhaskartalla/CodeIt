package hackerrank;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PlusMinus
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double pc=0,nc=0,zc=0;
        int n=sc.nextInt(),x=0;
        for(int i=0;i<n;i++)
        {
            x=sc.nextInt();
            if(x>0)
            {
                pc+=1;
            }
            else if(x<0)
            {
                nc+=1;
            }
            else
            {
                zc+=1;
            }         
        }
        System.out.printf("%.6f %n",(pc/n));
        System.out.printf("%.6f %n",(nc/n));
        System.out.printf("%.6f %n",(zc/n));        
    }
    
}
