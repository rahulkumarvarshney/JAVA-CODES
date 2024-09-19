class tp extends Thread
{
    public void run()
    {
        for(int i=1; i<=10;i++)
        {
            try
            {
            Thread.currentThread().setPriority(2);
                System.out.println("hello"+i);
                Thread.sleep(1);

            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }
    
    }
    class tps1 extends Thread
    {
        public void run()
        {
            for(int i=1; i<=20; i++)
            {
                try
                {
                    Thread.currentThread().setPriority(3);
                    System.out.println("hello1"+i);
                    Thread.sleep(i);
                }
                catch(Exception e)
                {
                    System.out.println(e);
                }
            }
            
        }
    }
    class tpp
    {
        public void run()
        {
            for(int i=100; i<=200; i++)
            {
                try
                {
                    if(i%2==0)
                    {
                        Thread.sleep(1000);
                        Thread.currentThread().setPriority(5);
                        System.out.println(i+"888rahul");
                       
                    }
                }
                catch(Exception e)
                {
                    System.out.println(e);
                }
            }
        }
        public static void main(String[] args) {
            
            tp t1=new tp();
            tps1 t2=new tps1();
            t1.start();
            t2.start();
            tpp t3=new tpp();
            t3.start();
            
            
            
        }
    }
