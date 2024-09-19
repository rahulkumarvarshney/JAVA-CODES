import java.util.Scanner;
class short_name
{
    public static void main(String[] args) {
        int j;
        String str1=new String();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
        str1=sc.nextLine();
        int i;
        char c,d;
        i=str1.length()-1;
        j=0;
        while(j<i)
        {
            if(j==0)
            {
                System.out.println(str1.charAt(j)+".");
            }
            else
            {
                c=str1.charAt(j);
                d=str1.charAt(j+1);
                if(c==' ' && d!=' ' )
                {
                    System.out.println(d+".");
                }
                
            }
            j++;
           
        }
        System.out.println(str1.substring(i));

    }
}
