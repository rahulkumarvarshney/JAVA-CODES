class a
{
    int a;
    int b;
}
class abc
{
    public static void main(String[] args) {
        a ob=new a();
        ob.a=Integer.parseInt(args[0]);
        ob.b=Integer.parseInt(args[1]);
        System.out.println(ob.a);
        System.out.println(ob.b);
    }
}