class the implements Runnable
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("from a"+i);
        }
    }
}

class runab
{
    public static void main(String[] args) {
        the ob=new the();
        Thread ob1=new Thread(ob);
        ob1.start();
        
    }
}
