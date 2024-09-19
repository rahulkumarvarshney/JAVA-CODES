import java.util.Scanner;
class counts_word
{
    public static void main(String[]args)
    {
        int i;
        int count=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String s=sc.nextLine();
        for(i=0; i<s.length(); i++)
        {
            if(s.charAt(i)==' ' && s.charAt(i+1)!=' ')
            {
                count++;
            }

        }
        System.out.println("count words"+count);

    }
}