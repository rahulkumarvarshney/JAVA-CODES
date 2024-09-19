import java.util.Scanner;
class one
{
    
    public static void main(String[]args)
    {
        int i,sum=0;
        int a[]=new int [5];
        Scanner ob=new Scanner(System.in);
        for(i=0; i<4; i++)
        {
            a[i]=ob.nextInt();
        }
        for(i=0; i<4; i++)
        {
            sum=sum+a[i];
            System.out.println(sum);
        }

    }
}