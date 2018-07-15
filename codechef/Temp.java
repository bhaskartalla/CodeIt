
package codechef;
public class Temp
{
    public static void main(String[] args)
    {
        String s="123";
       
        for(int i=0;i<(1<<s.length());i++)
        {
            for(int j=0;j<s.length();j++)
            {
                if((i&(1<<j))!=0)
                {
                    System.out.print(s.charAt(j));
                }
            }
            System.out.println();
        }
    }
    
}
