class a extends Thread
{
    public void run()
    {
        for(int i=1; i<=4;i++)
        {
            System.out.println("from a........"+i);
        }
    }
}
class yie
{
    public static void main(String[] args) {
        a ob=new a();
        ob.start();
        Thread.yield();
        for(int i=1; i<=4;i++)    //current main threads that provides the thread sheduler hint exceute the threads priority
        {
            System.out.println("main........"+i);
        }
        System.out.println(Thread.currentThread().getName());
    }
}
