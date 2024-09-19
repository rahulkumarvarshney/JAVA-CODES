interface customerRaj
{
int amt =5;    // public+static+final
public abstract void purchase();    // public+abstract
}
class sellerSanju implements customerRaj
{
    public void purchase()
    {
        // amt=7;   final
        System.out.println("raj needs"+amt+"kg rice");
    }
}
class check
{
    public static void main(String[] args) {
        customerRaj c=new sellerSanju();
        c.purchase();
       // System.out.println(customerRaj.amt);  static 
       // System.out.println(sellerSanju.amt);  static
    }
}