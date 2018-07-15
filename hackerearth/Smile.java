package hackerearth;
import java.util.Scanner;

public class Smile {
    
    int T,count1,count2;
    int s[],d[],k[];
    
    Scanner sc=new Scanner(System.in);
    Smile()
    {
        T=0;
        count1=0;
        count2=0;
        
    }
       
    void getdata()
    {
        T=sc.nextInt();
        s=new int[T];
        d=new int[T];
        k=new int[T];
        
        for(int t=0;t<T;t++)
        {
            s[t]=sc.nextInt();
            d[t]=sc.nextInt();
            k[t]=sc.nextInt();
        }
    }
    
    void perform()
    {
        int D,temp;
        for(int i=0;i<T;i++)
        {
            D=d[i]-s[i];
            for(int x=1;x<=D;x++)
            {
               temp=x;
                while(temp>0)
                {
                    if(temp%10==k[i])
                    {
                        count1++;
                    }
                    temp=temp/10;
                 }
            }
            for(int y=s[i];y<=d[i];y++)
            {
                temp=y;
                while(temp>0)
                {
                    if(temp%10==k[i])
                    {
                        count2++;
                    }
                    temp=temp/10;
                }
            }
            if(count1==count2)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }           
        }
    }
    
    public static void main(String z[])
    {
        Smile S1=new Smile();
        S1.getdata();
        S1.perform();
    }   
}

//*****************************************************************************
//OUTPUT
//21
//102 502 7
//42 8468 4
//6501 9170 4
//1479 9359 2
//4465 5706 5
//3282 6828 1
//492 2996 2
//4828 5437 1
//4605 3903 3
//293 2383 1
//8717 9719 5
//5448 1727 1
//1539 1870 2
//5668 6300 5
//9895 8704 1
//1323 334 3
//4665 5142 1
//8254 6869 7
//7645 2663 7
//38 2860 3
//9742 7530 8
//*****************************************************************************