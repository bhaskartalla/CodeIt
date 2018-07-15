
import java.math.BigDecimal;
import java.util.*;

public class Solution1{

    public static void main(String []args)
    {
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
      	sc.close(); 
      
        BigDecimal b[]=new BigDecimal[n];
        
        for(int i=0;i<0;i++)
        {
            b[i]=new BigDecimal(s[i]);
        }        
        Arrays.sort(s, Collections.reverseOrder(new Comparator<String>() {
    @Override
    public int compare(String a1, String a2) {
        //convert to big decimal inside comparator
        //so permanent string values are never changed
        //aka you only use the BigDecimal values to 
        //compare the strings!
        BigDecimal a = new BigDecimal(a1);
        BigDecimal b = new BigDecimal(a2);
        return a.compareTo(b);
    }
}));
        for(int i=0;i<0;i++)
        {
            System.out.println(b[i]);
        }
        
        
       
    }
}

