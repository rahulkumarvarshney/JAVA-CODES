class a

{
    int x,y;
    a()
    {
       x=9;
       y=9; 
       System.out.println(x);
       System.out.println(y);
    }
    a(a b)
    {
        x=b.x;
        y=b.y;
        System.out.println(x);
        System.out.println(y);
    }
    public static void main(String[] args) {
        a ob=new a();
        a ob1=new a(ob);
    }
}
