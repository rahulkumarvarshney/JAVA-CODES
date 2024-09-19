import java.util.*;
class rreverse
{
    public static void reve(String str)
    {
        // StringBuilder sb = new StringBuilder(str);
        // sb.reverse();
        // System.out.println(sb.toString());
            String rev="";
        char ch[]=str.toCharArray();
        for(int i=ch.length-1; i>=0; i--)
        {
            rev=rev+ch[i];
        }
        if(str.equals(rev))
        {
            System.out.println("string is palindrome :"+rev);
        }
        else
        {
            System.out.println("string is not palindrome :"+rev);
        }
    }
    public static void main(String[] args) {
        String str;
        Scanner sc=new Scanner(System.in);
        str=sc.nextLine();
        reve(str);
    }
}