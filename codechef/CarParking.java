package codechef;
import java.util.*;
 
public class CarParking
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int y=sc.nextInt();
        sc.nextLine();
        if(n<1 || m<2 || y<1) 
            System.exit(0);
        if((n*m)%y!=0)
        {
         System.out.println(-1);
        }
        else 
         {
              if(y>n && y>m)
                System.out.println(-1);
              if(y>n && y<m)
                System.out.println((n*m)/y+" "+1);
              else
                System.out.println((n*m)/y+" "+m);
         }
    }
} 