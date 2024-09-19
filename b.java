class a
{
    int a;
    int b;
    int x;
    int y;

a()
{
    a=10;
    b=11;
    System.out.println(a);
    System.out.println(b);
}
a(a ref)
{
    x=ref.a;
    y=ref.b;
    System.out.println(x);
    System.out.println(y);
}
}
class b
{
    public static void main(String[] args) {
        a a1 =new a();
        a a2=new a(a1);
    }
}

