class cons
{
    int a,b;
    cons()
    {
       a=7;
       b=8;
    }
    void show()
    {
        System.out.println(a);
        System.out.println(b);
    }
}
class def
{
    public static void main(String[] args) {
        cons ob =new cons();
        ob.show();
    }
}
