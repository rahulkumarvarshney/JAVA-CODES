import java.util.Scanner;
public class AreaOfTriangle {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("please enter your base in cm :");
    double base=sc.nextDouble();
    System.out.println("now,please perpendicular in height in cm :");
    double height=sc.nextDouble();
    double area=0.5*base*height;
    System.out.println("area of triangle :"+area+"cm2");
   }

}
