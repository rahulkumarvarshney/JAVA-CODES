import java.util.*;
public class factorials {
    public static long factorial(int y)
    {
       
        if(y<2)
        {
            return 1;
        }
        long fact=1;
        for(int i=2; i<=y; i++)
        {
            fact=fact*i;
        }
        return fact;


    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("please enter the number"); 
         int n=sc.nextInt();
         int z=(int)factorial(n);
        System.out.println(z);       
    }
    
}
