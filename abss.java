import java.util.Scanner;

interface first {
    void add();
    void mul();
}

interface second extends first {
    void division();
    void modules();
}

class abss implements second {
    int a;
    int b;
    int c;

    public void add() {
        System.out.println("Enter numbers");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        a = sc.nextInt();
        System.out.println("Enter second number");
        b = sc.nextInt();
        c = a + b;
    }

    public void mul() {
        System.out.println("Enter numbers");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        a = sc.nextInt();
        System.out.println("Enter second number");
        b = sc.nextInt();
        c = a * b;
    }

    public void division() {
        System.out.println("Enter numbers");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        a = sc.nextInt();
        System.out.println("Enter second number");
        b = sc.nextInt();
        c = a / b;
    }

    public void modules() {
        System.out.println("Enter numbers");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        a = sc.nextInt();
        System.out.println("Enter second number");
        b = sc.nextInt();
        c = a % b;
    }

    void show_first() {
        System.out.println(c);
    }

    void show_second() {
        System.out.println(c);
    }

    void show_third() {
        System.out.println(c);
    }

    void show_four() {
        System.out.println(c);
    }

    public static void main(String[] args) {
        abss ob = new abss();
        ob.add();
        ob.mul();
        ob.division();
        ob.modules();
        ob.show_first();
        ob.show_second();
        ob.show_third();
        ob.show_four();
    }
}
