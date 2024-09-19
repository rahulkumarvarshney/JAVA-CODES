import java.util.*;
class rahu
{
    double l,b,h,p;
    rahu(double l,double b,double h)
    {
      this.l=l;
      this.b=b;
      this.h=h;
    }
    void disp()
    {
         p=l*b*h;
    }
    void volume()
    {
        System.out.println("cuboid :"+p);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double length=sc.nextDouble();
        double breath=sc.nextDouble();
        double height=sc.nextDouble();
        rahu ob=new rahu(length,breath,height);
        ob.disp();
        ob.volume();

    }
}