//...declareing the thread  class
//...implementing the run method
//...starting new thread
class a extends Thread
{
    public void run()
    {
        System.out.println(Thread.currentThread().getName());
        System.out.println(" thread priority is :"+Thread.currentThread().getPriority());

        for(int i=1; i<=10;  i++)
         {
             try
             {
                Thread.sleep(2000);                
            
             }
             catch(Exception e)
             {
                 System.out.println("radhe govind");
             }
             System.out.println("from a"+i);
         }

       // int a=5,b=0,c;
        //c=a/b;
        //System.out.println(c);
        
    }
}

class b extends Thread
{
    
    public void run()
    {
       System.out.println(Thread.currentThread().getName());
       System.out.println(" thread priority is :"+Thread.currentThread().getPriority());

        for(int i=1; i<=10;  i++)
        {
        
                System.out.println("from b"+i);
                try
                {
                    Thread.sleep(2000);
                }
                catch(Exception o)
                {
                    System.out.println("jai baba ki");
                }
                
             
                
                

            
        }
        System.out.println("exit from b");
    }
}
class thread_ex
{
    public static void main(String[] args) {
       
        a ob=new a();
        //ob.setName("rahul");
        ob.setPriority(3);
        ob.start();
        b ob1=new b();
        //ob1.setName("rahul");
        ob1.setPriority(8);


        ob1.start();
        System.out.println(Thread.currentThread().getName());
        System.out.println(" thread priority is :"+Thread.currentThread().getPriority());
        
        
        
        for(int i=0; i<=7; i++)
        {
        
            System.out.println("jai shree rama");
        }
        
        
    }

}
