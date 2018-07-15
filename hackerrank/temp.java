
import static java.lang.Math.sqrt;
import java.util.*;

public class temp
{
    static int countLattice(int r)
    {
        if (r <= 0)
        {
            return 0;
        }
        int result = 4;
        for (int x=1; x<r; x++)
        {
            int ySquare = r*r - x*x;
            int y = (int)sqrt(ySquare);
            if (y*y == ySquare)
            {
                result += 4;
            }
        } 
        return result;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in); 
        int d=0,k=0;
        for(int i=sc.nextInt();i>0;i--)
        {
            d=sc.nextInt();
            k=sc.nextInt();
            System.out.println(((countLattice(d)>=k)?"impossible":"possible"));
        }        
    }
}


