import java.util.*;

public class Stack {
    static int top = -1; // top ko static variable banaya taki ye apni value retain kare

    public static void push(int item, int arr[]) {
        if (top == arr.length - 1) {
            System.out.println("Stack Overflow!");
        } else {
            arr[++top] = item;
            System.out.println("Item inserted: " + item);
        }
    }

    public static void pop(int arr[]) {
        if (top == -1) {
            System.out.println("Stack Underflow!");
        } else {
            int item = arr[top--];
            System.out.println("Item deleted: " + item);
        }
    }

    public static void display(int arr[]) {
        if (top == -1) {
            System.out.println("Stack is empty!");
        } else {
            System.out.println("Stack elements are:");
            for (int i = 0; i <= top; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Array ka size daaliye:");
        int n = sc.nextInt();
        int arr[] = new int[n];

        while (true) {
            System.out.println("Apna choice daaliye (1: Push, 2: Pop, 3: Display, 4: Exit):");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Push karne ke liye element daaliye:");
                    int item = sc.nextInt();
                    push(item, arr);
                    break;
                case 2:
                    pop(arr);
                    break;
                case 3:
                    display(arr);
                    break;
                case 4:
                    System.out.println("Program se exit ho rahe hain...");
                    System.exit(0);
                default:
                    System.out.println("Galat choice");
                    break;
            }
        }
    }
}
