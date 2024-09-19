class a
{
     final int x;
     a()
     {
        x=6;
     }
        void add()
        {
            
        System.out.println(x);

        }
        
   
        
    
}
class finv extends a
{
    void show()
    {
        System.out.println("danger");
    }
    public static void main(String[] args) {
        finv ob=new finv();
        ob.add();
        ob.show();
        
    }
}

