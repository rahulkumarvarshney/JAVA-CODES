import java.util.*;
public class compliment {
    public static void main(String[] args) {
        int number;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter number if you want to check the compliment");
        number=sc.nextInt();

        int result= ~number;
        System.out.println(result);
    }
}
