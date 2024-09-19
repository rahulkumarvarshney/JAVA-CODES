// class helloo {
//    private String name;
//     private int age;
//     private String address;

//     helloo(String name, int age, String address) {
//         this.name = name;
//         this.age = age;
//         this.address = address;
//     }

//     public String getDetails() {
//         return "Name: " + name + ", Age: " + age + ", Address: " + address;
//     }

//     public static void main(String[] args) {
//         helloo person = new helloo("Rahul", 25, "Aligarh, UP");
//         System.out.println(person.getDetails());
//         helloo person1 = new helloo("Avnish", 26, "Aligarh, UP");
//         System.out.println(person1.getDetails());
//     }
// }



public class employee {
    private String name;
    private double salary;

    // Default constructor
    public employee() {
        this.name = "unknown";
        this.salary = 0.0;
    }

    // Other constructors will go here
}
public class mployee {
    private String name;
    private double salary;

    // Default constructor
    public mployee() {
        this.name = "unknown";
        this.salary = 0.0;
    }

    // Constructor with name parameter
    public mployee(String name) {
        this.name = name;
        this.salary = 0.0; // Assuming default salary
    }

    // Other constructors will go here
}
public class ployee {
    private String name;
    private double salary;

    // Default constructor
    public ployee() {
        this.name = "unknown";
        this.salary = 0.0;
    }

    // Constructor with name parameter
    public employee(String name) {
        this.name = name;
        this.salary = 0.0; // Assuming default salary
    }

    // Constructor with name and salary parameters
    public employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Other constructors will go here
}

