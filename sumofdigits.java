import java.util.*;

public class sumofdigits {
    public static void sumdigits(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            while (num > 0) {
                int digit = num % 10;
                sum += digit;
                num /= 10;
            }
        }
        System.out.println("Sum of digits: " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Enter array size:");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sumdigits(arr);
    }
}
