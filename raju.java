import java.util.Scanner;

interface client

{
    void input();    //public+abstract

    void output();   //public+abstract

    static void add()
    {
        System.out.println("rahul varshney");
    }

}
class raju implements client
{
    String name;
    double value;
   public void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the username");
        name=sc.nextLine();
        System.out.println("enter the value");
        value=sc.nextDouble();


    }
    public void output()
    {
        System.out.println(name);
        System.out.println(value);
    }
    public static void main(String[] args) {
        client ob=new raju();
        ob.input();
        ob.output();
        

    }
}
