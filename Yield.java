class the extends Thread
{
    public void run()
    {
        for(int i=100; i<=200; i++)
        {
            
                System.out.println(i);
                System.out.println(Thread.currentThread().getName());
            
        }
    }
}


public class Yield  implements Runnable{
    public void run()
    {
        for(int i=0; i<=10; i++)
        {
            System.out.println(i);
            System.out.println(Thread.currentThread().getName());
        }
    }


    public static void main(String[] args) {
        the obs=new the();
        Yield y=new Yield();
        Thread th=new Thread(y);
        Thread th1=new Thread(obs);
        th.start();
        th1.start();
        for(int i=0; i<=5; i++)
        {
            System.out.println(i);
            System.out.println(Thread.currentThread().getName());
            Thread.yield();
        }
    }
}
