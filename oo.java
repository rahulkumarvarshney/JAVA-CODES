class a extends thread
{
    public void run()
    {
        for(int i=0; i<=5; i++)
        {
            System.out.println("my name is rahul varshney"+i);
        }
    }
}
class oo 
{
    public static void main(String[] args) {
        a ob=new a();
        ob.start();
    }
}