import java.util.*;
public class GRATEST_THREE {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter first number\n");
        System.out.println("now please enter second number\n");
        System.out.println("please enter third number");
            a=sc.nextInt();
            b=sc.nextInt();
            c=sc.nextInt();
            if(a>b)
            {
                if(a>c)
                {
                    System.out.println("a is greater");
                }
                else
                {
                    System.out.println("c is greater");
                }
            }
            else if(b>c)
            {
                System.out.println("b is greater");
            }
            else
            {
                System.out.println("c is greater");
            }

    }
}
