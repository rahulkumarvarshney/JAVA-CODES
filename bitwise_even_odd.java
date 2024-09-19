import java.util.*;
public class bitwise_even_odd {
    public static void main(String[] args) {
        int n;
        System.out.println("please enter you want to check even or odd");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if((n & 1)==1)
        {
            System.out.println("your number is odd");
        }
        else
        {
            System.out.println("your number is even");
        }

    }
}
