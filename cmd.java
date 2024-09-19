class cmd
{
    public static void main(String[] args) {
        // int a,b,c;
        // a=Integer.parseInt(args[0]);
        // b=Integer.parseInt(args[1]);
        // c=a+b;
        // System.out.println(c);
        int len,sum=0;
        len=args.length;
        for(int i=0;i<len;i++)
        {
            sum=sum+i;
            System.out.println(sum);
        }
    }
}
