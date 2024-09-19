import java.util.*;
public class leftshift {
    public static void main(String[] args) {
        int number;
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter this number");
        number=sc.nextInt();
        int result=number<<4;
        int resultright=number>>4;
        System.out.println(result);
        System.out.println(resultright);
        }
  
}
