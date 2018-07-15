package hackerrank;
import java.util.Scanner;
public class SteppingStonesGame 
{
    public static void main(String[] args)
    {       
         Scanner in = new Scanner(System.in);
        long t = in.nextLong();
        for(long i=0; i<t; i++)
        {
            long n = in.nextLong();
            double new_num = Math.sqrt((8*n)+1);
            System.out.println("new_num%1 : "+new_num%1);
            if(new_num%1 != 0)
            {
                System.out.println("Better Luck Next Time");
            }
            else
            {
                int pos = (int) new_num/2; 
                System.out.println("Go On Bob "+pos);
            }
        }
    }   
}