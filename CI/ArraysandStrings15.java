package CI;


import java.util.Scanner;

public class ArraysandStrings15
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        
        String st[]=s.split(" ");
        
        for(int i=0;i<st.length-1;i++)
        {
            System.out.print(st[i]+"%20");
        }        
        System.out.print(st[st.length-1]);
    }
}
