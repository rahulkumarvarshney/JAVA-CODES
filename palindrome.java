import java.util.*;
class palindrome
{
    public static void main(String[] args) {
        int n,s=0,r,c;
        System.out.println("enter any number");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        c=n;
        while(n>0)
        {
            r=n%10;
            s=(s*10)+r;
            n=n/10;
        }
        if(c==s)
        {
            System.out.println("number is palindrome");
        }
        else
        {
            System.out.println("number is not palindrome");
        }
    }
}
