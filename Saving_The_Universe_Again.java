import java.lang.*;
import java.util.*;

public class Saving_The_Universe_Again {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        
        for(int tc=1;tc<=t;tc++)
        {
            int d=sc.nextInt();
            String s=sc.next();
            char sca[]=s.toCharArray();
            int sia[]=new int[sca.length];
            int cd=0,str=1;
            
            for(int i=0;i<s.length();i++)
            {
                if(sca[i]=='C')
                {
                    str<<=1;
                    sia[i]=str;
                }
                else
                {
                    sia[i]=str;
                    cd+=sia[i];
                }
            }
            
            int flag=1,tempi=0,count=0;
            char tempc;
            while(cd>d && flag==1)
            {
                flag=0;                
                for(int j=s.length()-1;j>=0;j--)
                {
                    if(j>0 && sca[j]=='S' && sca[j-1]=='C')
                    {
                        tempc=sca[j];
                        sca[j]=sca[j-1];
                        sca[j-1]=tempc;
                        
                        tempi=sia[j]>>1;
                        sia[j-1]=tempi;
                        cd-=tempi;
                        count++;
                        flag=1;
                        break;
                    }
                }                
            }
            
            if(flag==0 && cd>d)
            {
                System.out.println("Case #"+tc+": IMPOSSIBLE");
            }
            else if(cd<=d)
            {
                System.out.println("Case #"+tc+": "+count);
            }
        }        
    }
}