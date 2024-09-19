import java.util.Scanner;
class fibbonaci
{
    public static void main(String[]args)
    {
        int n,a=0,b=1,c=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        n=sc.nextInt();
        for(int i=2; i<=n; i++)
        {
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
}