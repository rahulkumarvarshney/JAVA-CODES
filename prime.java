import java.util.Scanner;

class prime {


    public static void main(String[] args) {
        

        int n;
        int i=1;
        int count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number you want to prime");
        n=sc.nextInt();
    while (i<=n)
     {
        if(n % i == 0)
        {
            count++;
        }
        i++;
        
        
    }
    if(count==2)
        {
            System.out.println("prime number");
        }
        else
        {
            System.out.println("apni bhan chuda");
        }
    }

}