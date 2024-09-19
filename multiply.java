import java.util.*;
public class multiply {


    public static void multin(int y)
    {
        
        for(int i=1; i<=10; i++)
        {
           // int x=n*i;
            System.out.println(y+"*"+i+"="+y*i);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n; 
        System.out.println("please enter number");
        n=sc.nextInt();
        multin(n);
    }
}
