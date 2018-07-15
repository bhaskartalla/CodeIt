
class parent
{
//    parent()
//    {
//        System.out.print("this is parent");
//    }
//    parent(int a)
//    {
//        System.out.print("this is parent a : "+a);
//    }
}

public class child extends parent
{
    child()
    {
        System.out.print("this is child");
    }
    child(int a)
    {
        System.out.print("this is child a : "+a);
    }
    
    public static void main(String[] args) {
//        parent a1=new parent();
//        parent a2=new parent(10);
//        child b1 = new child();
        child b2 = new child(20);
        
    }
}
