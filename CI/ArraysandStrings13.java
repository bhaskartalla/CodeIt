package CI;


import java.util.*;


public class ArraysandStrings13
{    
    public static void removeDuplicates(char[] str)
    {
        if (str == null)
        {
            return;
        }
        int len = str.length;
        if (len < 2)
        {
            return;
        }

        int tail = 1;

        for (int i = 1; i < len; ++i)
        {
            int j;
            for (j = 0; j < tail; ++j)
            {
                if (str[i] == str[j])
                {
                    break;
                }
            }
            if (j == tail)
            {
                str[tail] = str[i];
                ++tail;
            }
        }
        str[tail] = 0;
        System.out.println(str);
    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
//        
//        removeDuplicates(s.toCharArray());
//        
        
//        for(int i=0;i<s.length();i++)
//        {
//            for(int j=i-1;j>=0;j--)
//            {
//                if(s.charAt(i)==s.charAt(j))
//                {
//                    s=s.substring(0,i)+s.substring(i+1,s.length());
//                    i-=1;
//                    break;
//                }
//            }
//        }
        
        LinkedHashSet<Character> l=new LinkedHashSet<Character>();

        for(int i=0;i<s.length();i++)
        {
            l.add(s.charAt(i));
        }
        
        for(Character c:l)
        {
            System.out.print(c);
        }
        
    }
}
