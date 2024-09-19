class thread1 extends Thread
{
    public void run()
    {
        System.out.println("video playing");
    }
}
class thread2 extends Thread
{
    public void run()
    {
        System.out.println("music playing");
    }
}
class thread3 extends Thread
{
    public void run()
    {
        System.out.println("timer");    }
}
class vlc
{
    public static void main(String[] args) {
        thread1 t1=new thread1();
        t1.start();
        thread2 t2=new thread2();
        t2.start();
        thread3 t3=new thread3();
        t3.start();
        
    }
}