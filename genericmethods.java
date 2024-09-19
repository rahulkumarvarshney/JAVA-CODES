class generi
{
     <E extends Number> void generic(E data)   //generic bounds
    {
        System.out.println(data);
    }
}
class genericmethods
{
    public static void main(String[] args) {
        generi ge=new generi();
            ge.generic(123);
            ge.generic("sharda");   

    }
}