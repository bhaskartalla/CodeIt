
import java.util.Scanner;
public class BinarySearchTree
{
    class Node
    {
        int value;
        Node left,right;
        public Node(int item)
        {
            value=item;
            left=right=null;
        }
    }    
    
    Node root;
    
    BinarySearchTree()
    {
        root = null;
    }
        
    Node insert(Node root,int key)
    {
        if(root==null)
        {
            root=new Node(key);
            return root;
        }
        else
        {
            if(key<root.value)
            {
                root.left=insert(root.left,key);
            }
            else
            {
                root.right=insert(root.right,key);
            }
        }
        return root;
    }
    
    Node search(Node root,int key)
    {
        if(root==null || root.value==key)
        {
            return root;
        }
        else
        {
            if(key<root.value)
            {
                return search(root.left,key);
            }
            else
            {
                return search(root.right,key);
            }
        }
    }
    
    void predeccessor(int item)
    {
        Node x=search(root,item);
        if(x!=null)
        {
            Node rt=root;
            if(x.left!=null)
            {
                System.out.println("Predeccessor of "+item+" : "+maximum(rt.left).value);
            }
            else
            {
                Node succ=null;
                while(rt!=null)
                {
                    if(rt.value<x.value)
                    {
                        succ=rt;
                        rt=rt.right;
                    }
                    else if(rt.value>x.value)
                    {
                        rt=rt.left;
                    }
                    else
                    {
                        if(succ==null)
                        {
                            System.out.println("No Predeccessor Found");
                        }
                        else 
                        {
                            System.out.println("Predeccessor of "+item+" : "+succ.value);
                        }
                        break;
                    }
                }
            }
        }
        else
        {
            System.out.println("Item value not found");
        }        
    }
    
    void successor(int item)
    {
        Node x=search(root,item);
        if(x!=null)
        {            
            Node rt=root;
            if(x.right!=null)
            {
                System.out.println("Successor of "+item+" : "+minimum(x.right).value);
            }
            else
            {
                Node succ=null;
                while(rt!=null)
                {
                    if(x.value<rt.value)
                    {
                        succ=rt;
                        rt=rt.left;
                    }
                    else if(x.value>rt.value)
                    {
                        rt=rt.right;
                    }
                    else 
                    {
                        if(succ==null)
                        {
                            System.out.println("No Successor Found");
                        }
                        else 
                        {
                            System.out.println("Successor of "+item+" : "+succ.value);
                        }
                        break;
                    }
                }
            }   
        }
        else
        {
            System.out.println("Item value not found");
        }     
    }
    
    Node minimum(Node root)
    {
        Node x=root;
        while(x!=null && x.left!=null)
        {
            x=x.left;
        }
        return x;
    }
    
    Node maximum(Node root)
    {
        Node x=root;
        while(x.right!=null)
        {
            x=x.right;
        }
        return x;
    }  
    
    void delete(int item)
    {
        Node succ=root;
        Node x=null;
        while(true)
        {
            if(succ!=null && item<succ.value)
            {
                if(succ.left!=null && succ.left.value==item)
                {
                    x=succ.left;
                    break;
                }
                else
                {
                    succ=succ.left;
                }
            }
            else if(succ!=null && item>succ.value)
            {
                if(succ.right!=null && succ.right.value==item)
                {
                    x=succ.right;
                    break;
                }
                else
                {
                    succ=succ.right;
                }
            }
            else
            {                
                x=succ;
                succ=null;;
                break;
            }
        }        
        if(x!=null)
        {
            if(x.left==null && x.right==null)
            {
                if(x==succ.left)
                {
                    succ.left=null;
                }
                else
                {
                    succ.right=null;
                }
            }
            else if(x.left==null)
            {
                if(x==succ.left)
                {
                    succ.left=x.right;
                }
                else
                {
                    succ.right=x.right;
                }
            }
            else if(x.right==null)
            {
                if(x==succ.left)
                {
                    succ.left=x.left;
                }
                else
                {
                    succ.right=x.left;
                }
            }
            else
            {
                Node t=minimum(x.right);
                delete(t.value);
                x.value=t.value;

            }   
        }
        else
        {
            System.out.println("Item value not found");
        }
    }
    
    void print()
    {
        inorder(root);
        System.out.println();
    }
    
    void inorder(Node root)
    {
        if(root!=null)
        {
            inorder(root.left);
            System.out.print(root.value+" ");
            inorder(root.right);
        }
    }
   
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        BinarySearchTree bst = new BinarySearchTree();
        while(true)
        {
            System.out.println("Enter the choice of Operation\n1) Insert\n2) Search \n3) Predessor \n4) Successor\n"
                    + "5) Minimum\n6) Maximum\n7) Delete\n8) Print\n9) Exit");
            int ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.print("Enter the value ");
                    bst.root=bst.insert(bst.root,sc.nextInt());
//                    bst.root=bst.insert(bst.root,7);
//                    bst.root=bst.insert(bst.root,2);
//                    bst.root=bst.insert(bst.root,1);
//                    bst.root=bst.insert(bst.root,6);
//                    bst.root=bst.insert(bst.root,4);
//                    bst.root=bst.insert(bst.root,3);
//                    bst.root=bst.insert(bst.root,5);
//                    bst.root=bst.insert(bst.root,12);
//                    bst.root=bst.insert(bst.root,8);
//                    bst.root=bst.insert(bst.root,13);
//                    bst.root=bst.insert(bst.root,10);
//                    bst.root=bst.insert(bst.root,9);
//                    bst.root=bst.insert(bst.root,11);               
                    break;
                case 2:
                    System.out.print("Enter the value  ");
                    Node x=bst.search(bst.root,sc.nextInt());
                    if(x==null)
                    {
                        System.out.println("No Value Found");
                    }
                    else 
                    {
                        System.out.println("Value Found : "+x.value);   
                    }
                    break;
                case 3:
                    if(bst.root!=null)
                    {
                        System.out.print("Enter the value  ");
                        bst.predeccessor(sc.nextInt());
                    }
                    else
                    {
                        System.out.println("No tree found");
                    }                    
                    break;
                case 4:
                    if(bst.root!=null)
                    {
                        System.out.print("Enter the value  ");
                        bst.successor(sc.nextInt());
                    }
                    else
                    {
                        System.out.println("No tree found");
                    }                    
                    break;
                case 5:
                    if(bst.root!=null)
                    {
                        System.out.println("Minimum Value : "+bst.minimum(bst.root).value);
                    }
                    else
                    {
                        System.out.println("No tree found");
                    }                     
                    break;
                case 6:
                    if(bst.root!=null)
                    {
                        System.out.println("Maximum Value : "+bst.maximum(bst.root).value);
                    }
                    else
                    {
                        System.out.println("No tree found");
                    }                      
                    break;
                case 7:
                    if(bst.root!=null)
                    {
                        System.out.print("Enter the value : ");
                        bst.delete(sc.nextInt());
                    }
                    else
                    {
                        System.out.println("No tree found");
                    }
                    break;
                case 8:                    
                    bst.print();
                    break;
                case 9:
                    System.exit(0);
                    break;
            }
        }        
    }    
}
