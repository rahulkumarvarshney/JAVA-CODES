class test extends Thread
{
    
    public void run()
    {
        System.out.println("child thread");
        System.out.println(" thread priority is :"+Thread.currentThread().getPriority());
    
        
    }
}
class thre_priority
{
    public static void main(String[] args) {
        ap t=new ap();
        

        t.start();
        Thread.currentThread().setPriority(6);
        

        
        System.out.println("main thread priority is :"+Thread.currentThread().getPriority());
        System.out.println("njhhuguftydyt");
    }
}
