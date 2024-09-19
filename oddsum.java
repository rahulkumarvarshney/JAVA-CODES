import java.util.*;
public class oddsum {

    public static int oddsum(int x)
    {
        int sum=0;
        for(int i=1; i<=x; i++)
        {
            
                if(i%2!=0)
                {
                    sum=sum+i;
                }
            
            
        }
        return sum;
    }
    public static void main(String[] args) {

        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter the number");
        n=sc.nextInt();
       int z= oddsum(n);
       System.out.println(z);
       
       
    }
    
}
