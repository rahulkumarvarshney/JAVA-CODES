
class star
{
   static int z;
    static void sum(int a,int b)
    {
      z=a+b;
    //System.out.println(z);
    }
     static void disp()
    {
        System.out.println(z);

    }

     static void sum(int x,int y,int n)
    {
      z=x-y-n;
    //System.out.println(z);
    }
     static void show()
    {
        System.out.println(z);

    }

    public static void main(String args[])
    {
        star.sum(5,3);
        star.disp();
        star.sum(5,6,8);
        star.show();

    }
}
