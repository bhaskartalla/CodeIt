package hackerrank;

import static java.lang.Math.abs;
import java.util.Scanner;

public class FindthePoint 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int px,py,qx,qy,d;
        for(int i=0;i<n;i++)
        {
            d=0;
            px=sc.nextInt();
            py=sc.nextInt();
            qx=sc.nextInt();
            qy=sc.nextInt();
            
            System.out.println((2*qx - px)+" "+(2*qy - py));
            
            d=(int)(Math.sqrt((qx-px)*(qx-px)+(qy-py)*(qy-py)));
            System.out.println(abs(qx+d)+" "+abs(qy+d));
        
        
        }
    }
}
