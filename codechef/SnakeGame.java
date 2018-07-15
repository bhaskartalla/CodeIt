package codechef;


public class SnakeGame extends Thread
{
    public static void main(String[] args)
    {
        char mat[][]=new char[25][25];
        int n=25;
        
        char s[]={'*','*','*','*','*','*','*','*','*','*'};

        
        
        for(int i=0;i<10;i++)
        {
            s[i]='-';
            System.out.print(s);
            s[i]='*';
            try
            {
                Thread.sleep(1000);
            } catch (InterruptedException e)
            {
                //System.out.println(e);
            }               
            System.out.print("\b\b\b\b\b\b\b\b\b\b");
        }       
          
      
//        for(int i=0;i<n;i++)
//        {
//            for(int j=0;j<n;j++)
//            {               
//                if(i==0 || i==n-1)
//                {
//                    System.out.print(" + ");
//                }  
//                else if(j==0 || j==n-1)
//                {
//                    System.out.print(" + ");
//                }
//                else
//                {
//                    System.out.print("   ");
//                }
//            }
//            System.out.println();
//        }
    }
}








