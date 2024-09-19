class a
{
      
    final  void show()  //this meythod is final //
        {
            System.out.println("badmash");
        }
        
   
        
    
}
class finm extends a
{
    void show()
    {
        System.out.println("danger");
    }
    public static void main(String[] args) {
        finm ob=new finm();
 //      a ob1=new a();
   //    ob1.show();
        
        ob.show();
        
    }
}