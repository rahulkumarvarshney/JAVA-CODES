// class a
// {
//     int i=10;
// }
// class b extends a
// {
//     int i=10;
//     void show(int i)
//     {
//         System.out.println(i);
//         System.out.println(this.i);
//         System.out.println(super.i);
//     }
    
// }
// class super_use
// {
//     public static void main(String[] args) {
//         b ob=new b();
//         ob.show(11);
//     }
// }

class a
{
    void m1()
    {
        System.out.println("i am in class a");
    }
}
class b extends a
{

    void m1()
    {
        super.m1();
        System.out.println("i am in class b");
    }
    // void show()
    // {
    //     m1();
    //     super.m1();
    // }
}
class super_use{
    public static void main(String[] args) {
        b ob=new b();
       // ob.show();
       ob.m1();
    }
}