public class gcdd {
    public static int gcd(int a,int b)
    {
        if(a==0)
        {
            return b;
        }
        if(b==0)
        {
            return a;
        }
        if(a==b)
        {
            return a;
        }
        if(a>b)
        {
            return gcd(a-b,b);
            
        }
        return gcd(b,a-b);
        
    }
    public static void main(String[] args) {
        int a=20;
        int b=30;
       System.out.println(gcd(a,b)); 
    }
}
