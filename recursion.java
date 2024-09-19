import java.util.Scanner;

class recursion
{
    static int sum(int x)
    {
        if(x==1)
        {
            return 1;
        }
        else
        {
            return x+sum(x-1);
        }
    }
    public static void main(String[] args) {
        int f;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        f=sc.nextInt();
        int k=sum(f);
        System.out.println("the sum of natural number is: "+k);
    }
}