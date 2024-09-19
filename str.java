import java.util.Scanner;
class str
{
    public static void main(String[] args) {
        
        char ch;
        System.out.println("enter any number");
        Scanner sc=new Scanner(System.in);
        ch=sc.next().charAt(0);
        int n=ch;
        System.out.println("Ascii value of charcter"+ ch +"Ascii charcter "+ n);

    }
}
