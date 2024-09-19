class unit
{
    public static void main(String[] args) {
        int n,bill=0,fc=250;
        n=Integer.parseInt(args[0]);
        if(n<=100)
        {
            bill=n*3;
        }
        else if(n>100 && n<=200)
        {
            bill=n*4;
        }
        else
        {
            bill=n*5;
        }
            int finall_bill=bill+fc;
            System.out.println(finall_bill);

    }
}
