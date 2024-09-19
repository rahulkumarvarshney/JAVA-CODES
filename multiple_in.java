interface a
{
    public void show();
}
interface b
{
    public void disp();
}
class z implements a,b
{
    public void show()
    {
        System.out.println("my name is rahul varshney");
    }
    public void disp()
    {
        System.out.println("radhey radhey");
    }
}
class multiple_in
{
    public static void main(String[] args) {
        z ob=new z();
        ob.disp();
        ob.show();
    }
}
