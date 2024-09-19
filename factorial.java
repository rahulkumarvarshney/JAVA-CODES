import java.util.Scanner;
class factorial
{
    public static void main(String[] args) {
        factorial f1=new factorial();
        System.out.println(f1.fact(5));
    }
    int fact(int b)
    {
        if(b==1)
        {
            return 1;
        }
        else
        {
            return b*fact(b-1);   
        }

    }
}
