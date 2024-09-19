import java.util.Scanner;
public class swapchal {
    public static void main(String[] args) {
        int a,b,c;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number");
        a=sc.nextInt();
        System.out.println("enter second number");
        b=sc.nextInt();
        System.out.println(a);
        System.out.println(b);

        c=a;
        a=b;
        b=c;
        System.out.println(a);
        System.out.println(b);

    }
}
