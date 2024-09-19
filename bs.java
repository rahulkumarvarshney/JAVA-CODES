interface raju
{
    int amt=6;
   public void purchase();
}
class a implements raju
{
   public void purchase()
    {
        System.out.println("raju needs "+ amt +" kg rice");
    }
}
class bs
{
public static void main(String[] args) {
    raju ob=new a();
    ob.purchase();
}
}