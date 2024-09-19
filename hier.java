class a
{
    void input()
    {
        System.out.println("what is your name");
    }
}
class b extends a
{
    void pri()
    {
        System.out.println("my name is rahul varshney");
    }
}
class c extends a{
    void disp()
    {
        System.out.println("my name is manish varshney");
    }
}
class hier
{
    public static void main(String[] args) {
        c ob=new c();
        ob.input();
      ob.pri();
        ob.disp();
    }
}
