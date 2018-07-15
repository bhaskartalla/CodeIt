package hackerearth;

import java.util.Scanner;

 class playful 
{
    Scanner sc = new Scanner(System.in);
    int T;
    String s[];
    
    playful()
    {}
    
    void getdata()
    {
        T = sc.nextInt();
        s = new String[T];
        
        for(int i=0;i<T;i++)
        {
            s[i] = sc.next();
        }
    }
    
    void perform()
    {
        String temp;
        int flag=0;
        for(int i=0;i<T;i++)
        {
            temp=s[i];
            for(int j=0;j<s[i].length()-1;j++)
            {
          
                if((temp.charAt(j)-temp.charAt(j+1)==1 || temp.charAt(j)-temp.charAt(j+1)==-1) || (temp.charAt(j)=='z' && temp.charAt(j+1)=='a') || (temp.charAt(j)=='a' && temp.charAt(j+1)=='z'))
                {
                    continue;
                }
                else
                {
                    flag=1;
                    break;       
                }
            }
            if(flag==0)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
                flag=0;
            }
        }
    }
    
    public static void main(String z[])
    {
        playful P1 = new playful();
        P1.getdata();
        P1.perform();
    }
}

//******************************************************************************
//OUTPUT
//5
//qwertyu
//awdeikjou
//zxasccgfndjhiyehvafsqubd
//vzgcshugpiiioqe
//zxcvbnm,asdfghjklwertyui
//******************************************************************************