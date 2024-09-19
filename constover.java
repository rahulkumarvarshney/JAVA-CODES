 class constover {
    int a,b,m;
    double s;
    constover()
    {
        a=10;
        b=20;
        int c=a+b;
        System.out.println(c);
    }
    constover(int x,int y)
    {
        a=x;
        b=y;
        System.out.println(a+" "+b);
    }
    constover(int x,double y,int z)
    {
        a=x;
        s=y;
        m=z;
        System.out.println(a+" "+s+" "+m);
    }
    public static void main(String[] args) {
        constover ob1=new constover();
        constover ob2=new constover(10,20);
        constover ob3=new constover(10,20.20,10);
        
    }
    
}
