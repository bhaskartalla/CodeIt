package codechef;
//done
import java.util.Scanner;
public class TumblingMonkeysANDDancingApes
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        for(int t=sc.nextInt();t>0;t--)
        {
            int n=sc.nextInt();
            int m[]=new int[n+1];
            int p[]=new int[n+1];
            int q[]=new int[n+1];
            int count=0;
            boolean flag=false;
            
            for(int i=1;i<n+1;i++)
            {
                p[i]=sc.nextInt();
                m[i]=i;
            }
            
            while(!flag)
            {
                count++;
                for(int i=1;i<n+1;i++)
                {
                    q[p[i]]=m[i];
                }
                flag=true;
                for(int i=1;i<n+1;i++)
                {
                    m[i]=q[i];
                    if(m[i]!=i)
                    {
                        flag=false;
                    }
                }
            }   
            System.out.println(count);
        }        
    }
}
