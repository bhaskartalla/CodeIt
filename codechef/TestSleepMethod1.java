package codechef;


public class TestSleepMethod1 extends Thread
{
    static int bs(int a[],int s,int e,int f)
    {
        int m=(s+e)/2;
        if(e<s)
        {
            return -1;
        }
        if(a[m]==f)
        {
            return m;
        }
        else if(a[m]>f)
        {
            return bs(a,s,m-1,f);
        }
        else
        {
            return bs(a,s+1,m,f);
        }       
    }
    public static void main(String args[])
    {
       
        int a[]={0,1,2,3,4,5,6,7,8,9};
        System.out.println(bs(a,0,9,-5));
    }
}

