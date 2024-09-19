import java.util.*;
public class switch_oper {

    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your charcter");
       String ch=sc.next();
       char ch1=ch.charAt(0);
       System.out.println("enter your first number");
       a=sc.nextInt();
       System.out.println("enter your second number");
       b=sc.nextInt();
       
       switch(ch1)
       {
            
            case '-':System.out.println(a-b);
            
            default:System.out.println("wrong operator can be used...");
            case '+':System.out.println(a+b);

       }

    }
    
}
