import java.util.*;
// class statics
// {
    
//     static int a=10;
//     void m1()
//     {
//          static int b=20;
//     }
// }

// class Test
// {
//      int a=10;
//     void m1()
//     {
//         System.out.println("hello how are you");
//     }
//     public static void main(String[] args) {
//         System.out.println(Test.a);
        
//     }
// }
class Test
{

    static int count=0;
    void counterdemo()
    {
        count++;
        System.out.println(count);
    }
    public static void main(String[] args) {
        Test t1=new Test();
        Test t2=new Test();
        Test t3=new Test();
        t1.counterdemo();
        t2.counterdemo();
        t3.counterdemo();
    }
}
