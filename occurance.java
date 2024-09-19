import java.util.Scanner;
class occurance
{
    public static void main(String[]args)
    {
        String str;
        int i;
        int count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
        str=sc.nextLine();
        String temp[]=str.split(" ");
        String search;
        search=sc.nextLine();
        System.out.println("enter charcter");
        for(i=0; i<str.length(); i++)
        {
            if(search.equals(temp[i]))
            {
                count++;
            }
            System.out.println("occurances is:"+str);
            System.out.println(count);
        }

    }
}