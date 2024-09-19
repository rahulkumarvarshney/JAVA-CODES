class a
{
    int a=29;
}
class b extends a
{
    int a=25;
    void show()
    {
        System .out.println(a);
        System .out.println(super.a);
    }
}
class sk
{
    public static void main(String[] args) {
        b ob=new b();
        ob.show();
        
    }
}
