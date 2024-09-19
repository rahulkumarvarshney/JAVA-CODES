import java.util.concurrent.SubmissionPublisher;

class su
{
    int roll=5;
    String name="rahul";
    int age=5;
    
}
class simple extends su
{
    void disp()
    {
        roll=34;
        name="danish";
        age=20;

    }
    void scan()
    {
        System.out.println(roll);
        System.out.println(name);
        System.out.println(age);
    }
    public static void main(String args[])
    {
        simple ar=new simple();
        ar.disp();
        ar.scan();
    }
}
