import java.util.Scanner;
class vowel_cons
{
    public static void main(String[] args) {
        int i;
        int vol=0;
        int cons=0;
        String str=new String();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        str=sc.nextLine();
        str=str.toUpperCase();
        for(i=0; i<str.length(); i++)
        {
            char c=str.charAt(i);
            if(c!=' ')
            {
                if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
                {
                    vol++;
                }
                cons++;
            }
        }
        System.out.println("vowels :"+vol);
        System.err.println("constonent :"+cons);
    }
}
