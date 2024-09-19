class a {
    int c,d;
    void show()
    {
        System.out.println("hello how are you");
    }
    a(int a,int b)
    {
        c=a;
        d=b;
        System.out.println(c+" "+d);
    }
}
class b extends a
{
    
    void show()
    {
        System.out.println("jai shree radhe");
        super.show();
    }
}
class supers
{
    public static void main(String[] args) {
        b ob=new b();
        ob.show();
    }
    

}
//wap to remove punchuations from a given string
//wap to sort the sentence in alphabetical order


