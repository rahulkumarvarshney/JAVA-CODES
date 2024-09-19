import java.util.Scanner;
class functions
{
    public static void main(String[]args)
    {
            Scanner sc=new Scanner(System.in);
            int n=5433231;
            int count=0;
            System.out.println("enter your key");
            int key=sc.nextInt();
            System.out.println(n);
            while(n>0)
            {
                int digit=n%10;
                int store=digit;
                n=n/10;
                if(store==key)
                {
                    count++;
                }
            }

            
            System.out.println(count);

    }

}