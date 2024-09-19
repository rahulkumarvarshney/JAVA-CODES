interface a
{
public abstract void show();
//public abstract void abc();
}
interface b
{
   public abstract void show();

}
class multiple implements a,b
{
    int a=5;
    int b=7;
    int c;
    public void show()
    {
        c=a+b;
        System.out.println(c);
    }
   public void disp()
   {
       System.out.println("ms dhoni");
   }
   public void abc()
   {
       System.out.println("damodar das");
   }
    public static void main(String[] args) {
        multiple ob=new multiple();
        ob.show();
        ob.disp();
        ob.abc();
        
    }
}