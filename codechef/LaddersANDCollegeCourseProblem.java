package codechef;
//done
import java.util.Scanner;
public class LaddersANDCollegeCourseProblem
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        for(int t=sc.nextInt();t>0;t--)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            int p=sc.nextInt();
            int a[]=new int[n];
            int b[]=new int[n];
            int tot[]=new int[n];
            
            for(int i=0;i<n;i++)
            {
                tot[i]=Integer.MAX_VALUE;
                a[i]=sc.nextInt();
            }
            for(int i=0;i<n;i++)
            {
                b[i]=sc.nextInt();
            }           
            tot[0]=(a[0]<b[0])?a[0]:b[0];
            char c=(a[0]<b[0])?'a':'b';

            for(int i=1;i<n;i++)
            {
                for(int j=0;j<i;j++)
                {                    
                    if(j+k>=i)
                    {
                        if(c=='a')
                        {
                            tot[i]=Math.min(tot[i],tot[j]+((a[i]<b[i]+p)?a[i]:b[i]+p));
                            c=(a[i]<b[i]+p)?'a':'b';
                        }
                        else
                        {
                            tot[i]=Math.min(tot[i],tot[j]+((a[i]+p<b[i])?a[i]+p:b[i]));
                            c=(a[i]+p<b[i])?'a':'b';
                        }
                    }                 
                }
            }  
            System.out.println(tot[n-1]);
        }
    }
}
