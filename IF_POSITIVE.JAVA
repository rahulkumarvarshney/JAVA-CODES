import java.util.*;
class IF_POSITIVE
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        Double n;
        System.out.println("enter number");
        n=sc.nextDouble();
        if(n>0)
        {
            System.out.println("number is  positive");
        }
        else
        {
            System.out.println("number is negattive");
        }
    }

}