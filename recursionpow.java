public class recursionpow {
    public static int pow(int y,int n)
    {
        if(n==0)
        {
            return 1;
        }
        else
        {
            
            return (int)Math.pow(y, n);
        }
    }
    public static void main(String[] args) {
        int pows=2;
        int z=10;
        int m=pow(pows,z);
        System.out.println(m);

    }
}
