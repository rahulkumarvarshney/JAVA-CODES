package hello;

public class student {
    public int age;
    public int roll;
    private String name;
    // private int roll;
    public static int marks = 10;

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public student(int age, int roll, String name) {
        this.age = age;
        this.roll = roll;
        this.name = name;
        marks++;
    }

    public void inc() {
        marks++;
        System.out.println(marks);
    }
}
