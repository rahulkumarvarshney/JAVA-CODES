import java.util.*;
public class exception {
    public static void main(String[] args) {
        try
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter first element");
            int a=sc.nextInt();
            System.out.println("enter second element");
            int b=sc.nextInt();
            int c=a/b;
            int arr[]=new int[10];
        }
        catch(Exception e)
        {
            System.out.println("cant't divide by zero",e);
        }
        catch(Exception e)
        {
            System.out.println(Exception e );
        }
    }
}