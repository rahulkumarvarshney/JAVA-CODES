class itself
{
    public static void main(String[] args) {
        itself ob=new itself();

       int r=ob.sum(3);
       System.out.println(r);
    }
    int sum(int b)
    {
        if(b>0)
        {
            return b+sum(b-1);
        }
        else
        {
            return 0;
        }
    }
}