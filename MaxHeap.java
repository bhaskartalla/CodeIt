
import java.util.Scanner;


public class MaxHeap
{    
    int A[];
    int hs;
    MaxHeap()
    {
        A=new int[14];
        hs=-1;
    }
    
    int getParentIndex(int x)
    {
        return (int)(x-1)/2;
    }    
    
    int getLeftChildIndex(int x)
    {
        return 2*x+1;
    }
    
    int getRightChildIndex(int x)
    {
        return 2*x+2;
    }
    
    void swap(int x,int y)
    {
        int t=A[x];
        A[x]=A[y];
        A[y]=t;
    }
    
    void maxHeapify(int i)
    {
        int l=getLeftChildIndex(i);
        int r=l+1;
        int largest=-1;
        if(l<=hs && A[l]>A[i])
        {
            largest=l;
        }
        else 
        {
            largest=i;
        }
        if(r<=hs && A[r]>A[largest])
        {
            largest=r;
        }
        if(largest!=i)
        {
            swap(largest,i);
            maxHeapify(largest);
        }        
    }
    
    void buildMaxHeap()
    {
        for(int i=getParentIndex(hs);i>=0;i--)
        {
            maxHeapify(i);
        }
    }
    
    void insert(int x)
    {
        hs++;
        increaseKeyValue(hs,x);
    }
    
    void delete()
    {
        if(hs<0)
        {
            System.out.println("Error..!! Heap Underflow");
            return;
        }        
        A[0]=A[hs];
        A[hs--]=0;
        maxHeapify(0);
    }
    
    int findMax()
    {
        return A[0];
    }
    
    void heapSort()
    {
        int t=hs;
        while(hs>0)
        {
            swap(0,hs);
            hs--;
            maxHeapify(0);
        }
        hs=t;
    }
    
    void increaseKeyValue(int i,int val)
    {
        if(i>hs)
        {
            System.out.println("Index value out of range");
            return;
        }
        if(A[i]>val)
        {
            System.out.println("Error..!! new key is samller than current key");
            return;
        }
        A[i]=val;
        while(i>0 && A[getParentIndex(i)]<A[i])
        {
            swap(getParentIndex(i),i);
            i=getParentIndex(i);
        }
    }
    
    void decreaseKeyValue(int i,int val)
    {
        if(i>hs)
        {
            System.out.println("Index value out of range");
            return;
        }
        if(A[i]<val)
        {
            System.out.println("Error..!! new key is greater than current key");
            return;
        }
        A[i]=val;
        maxHeapify(i);
    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        MaxHeap H=new MaxHeap();
        while(true)
        {
            System.out.println("1) Building a Heap\n2) Insert into Heap\n3) Delete"
                    + " Max\n4) Find Max\n5) Heap Sort\n6) Increase Key value\n7) Decrease Key value\n8) Print\n9) Exit");
            int ch=sc.nextInt();
            
            switch(ch)
            {
                case 1:
                    System.out.print("Enter no. of elements    ");
                    int n=sc.nextInt();
                    
                    for(int i=0;i<n;i++)
                    {
                       H.A[i]=sc.nextInt();
                       H.hs++;
                    }
                    H.buildMaxHeap();
                    break;
                case 2:
                    System.out.print("Enter the element   ");
                    H.insert(sc.nextInt());
                    break;
                case 3:
                    H.delete();
                    break;
                case 4:
                    System.out.println("Maximum : "+H.findMax());
                    break;
                case 5:
                    H.heapSort();
                    break;
                case 6:
                    System.out.println("Enter the index and key value   ");
                    H.increaseKeyValue(sc.nextInt(), sc.nextInt());
                    break;
                case 7:
                    System.out.println("Enter the index and key value   ");
                    H.decreaseKeyValue(sc.nextInt(), sc.nextInt());
                    break;                
                case 8:
                    for(int i=0;i<=H.hs;i++)
                    {
                        System.out.print(H.A[i]+" ");
                    }
                    System.out.println();
                    break;                    
                case 9:
                    System.exit(0);
                    break;
            }
        }
    }
}
