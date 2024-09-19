import java.util.*;
public class lcm {

    public static int lowest(int first,int second)
    {
            int i=1;
            while(i<=second)
            {
                int factor=first*i;
                if(factor%second==0)
                {
                    return factor;
                }
                i++;
            }
            return 0;

    }
    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);

        int first;
        System.out.println("please enter first number");
        first=sc.nextInt();
        int second;
        System.out.println("please enter second number");
            second=sc.nextInt();
           int x= lowest(first,second);    
           System.out.println(x);    
    }
    
}
