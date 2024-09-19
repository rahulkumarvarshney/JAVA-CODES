abstract class vehicle
{
    abstract void start();
    void show()
    {
        System.out.println("chalo gla...");
    }
}

class car extends vehicle
{
    void start()
    {
        System.out.println("car starts with kick");
    }
    
}
class scooter extends vehicle
    {
        void start()
    
            {
                System.out.println("starts with kicks");
            }
           
    }
    class abstract_use
    {
        
        public static void main(String[] args) {
            vehicle v=new car();
            v.start();
            v.show();
            scooter s=new scooter();
            s.start();
        }
    }
    
