import java.util.Scanner;
public class arm {
    public static void main(String[] args) {
        int n,c,arm=0,rem;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        c=n;
        while(n>0)
        {
            rem=n%10;
            arm=((rem*rem*rem)+arm);
            n=n/10;


        }
        if(c==arm)
        {
            System.out.println("armstrong number");
        }
        else
        {
            System.out.println("not");
    
        }
    }
}

    
