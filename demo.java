public class demo {
    public static void main(String[] args) {
        Thread t1=new Thread(new count);
        Thread t2=new Thread(new odd);
        Thread t3=new Thread( new div);
        t1.start();
        t2.start();
        t3.start();

    }
    static class count
    {
        public void run()
        {
            for(int i=0; i<=100; i++ )
            {
                System.out.println(i);
                Thread.sleep(1);
               
            }
            
        }
    }
    static class odd
    {
        public void run()
        {
            for(int i=1000; i<=1500; i++)
            {
                if(i%2!=0)
                {
                    System.out.println(i);
                    Thread.sleep(1);
                }
                
               
            }
            
        }
    }
    static class div
    {
        public void run()
        {
            for(int i=2000; i<=8000; i++)
            {
                if(i%3==0||i%5==0||i%7==0)
                {
                    System.out.println(i);
                    Thread.sleep(1);
                }
                
               
            }
            
        }
    }
    
}
