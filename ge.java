// // class getset extends Thread
// // {
// //     public void run()
// //     {
// //         Thread.currentThread().setName("first");
// //         System.out.println("hello");
// //       System.out.println(  Thread.currentThread().getName());
// //     }
// //     public static void main(String[] args) {
// //         getset gs=new getset();
// //         gs.start();
// //         System.out.println(Thread.currentThread().getName());

// //     }
// // }



// class getset extends Thread
// {
//     public void run()
//     {
//         for(i=1; i<=5; i++)
//         {
//             try
//             {
//                 Thread.sleep(1000);
//                 System.out.println(i);

//             }
//             catch(Exception e)
//             {
//                 System.err.println(e);
//             }
//         }
        
//     }
//     public static void main(String[] args) {
//         getset gs=new getset();
//         gs.start();
//     }
// }
public class ge {
    private String name;
    private double salary;

    // Default constructor
    public ge() {
        this.name = "unknown";
        this.salary = 0.0;
    }

    // Constructor with name parameter
    public ge(String name) {
        this.name = name;
        this.salary = 0.0; // Assuming default salary
    }

    // Constructor with name and salary parameters
    public ge(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Method to get details
    public String getdetails() {
        return "name:" + name + ", salary:" + salary;
    }

    // Main method to demonstrate usage
    public static void main(String[] args) {
        // Creating instances using different constructors
        ge e1 = new ge(); // Default constructor
        ge e2 = new ge("John Doe"); // Constructor with name parameter
        ge e3 = new ge("Jane Smith", 50000.0); // Constructor with name and salary parameters

        // Getting and printing details
        System.out.println("Details for e1: " + e1.getdetails());
        System.out.println("Details for e2: " + e2.getdetails());
        System.out.println("Details for e3: " + e3.getdetails());
    }
}
