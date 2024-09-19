import java.util.Scanner;
class task {
    String str;
    char ch;
    String remove(String str,char ch)
    {
        String str1="";
        this.str=str;
        this.ch=ch;

        for(int i=0; i<str.length(); i++)
        {
            if(str.charAt(i)!=ch)
            {
                str1=str1+str.charAt(i);
            } 
        }
        return str1;
    }
    public static void main(String[] args) {
        String str1;
        char ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
        str1=sc.next();
        System.out.println("enter charcter");
        ch=sc.next().charAt(0);
        task ts=new task();
        System.out.println(ts.remove(str1, ch));
        
    }
}
