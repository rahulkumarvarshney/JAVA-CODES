interface a
{
    public void add();
}
interface b extends a
{
    public void sub();
}
class intspin implements b
{
    public void add()
    {
        int a=6,b=9,c;
        c=a+b;
        System.out.println(c);
    }
    public void sub()
    {
        int a=9,b=3,c;
        c=a+b;
        System.out.println(c);
    }
    
    public static void main(String[] args) {
        b obj=new intspin();
        obj.add();
        obj.sub();
    }
}A


interface a
{
    public void add();
}
interface b 
{
    public void sub();
}
class intspin implements a,b
{
    public void add()
    {
        int a=6,b=9,c;
        c=a+b;
        System.out.println(c);
    }
    public void sub()
    {
        int a=9,b=3,c;
        c=a+b;
        System.out.println(c);
    }
    
    public static void main(String[] args) {
        intspin obj=new intspin();
        obj.add();
        obj.sub();
    }
}

