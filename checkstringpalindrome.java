import java.util.Scanner;
class checkstringpalindrome{
    public static void main(String[] args) {
        String reverse;
        String s="";
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
        s=sc.nextLine();
        for(int i=s.length()-1; i>=0; i--)
        {
            reverse= reverse+ s.charAt(i);
        }
    }
}