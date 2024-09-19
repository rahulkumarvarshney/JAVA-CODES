
class a
{
    int a=20,b=10,c;
    void add()
    {
        c=a+b;
        System.out.println(c);
    }
}
class b extends a
{
    void sub()
    {
        c=a-b;
        System.out.println("sub : "+c);
    }
}
class c extends b
{
    void mul()
    {
        c=a*b;
        System.out.println("multiply: "+c);
    }
}
class multi 
{
    public static void main(String[] args) {
        c ob=new c();
        ob.add();
        ob.sub();
        ob.mul();

    }
}
