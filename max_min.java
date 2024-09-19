import java.util.*;

public class max_min {
    public static int max(int arr[]) {
        if (arr.length == 0) {
            return Integer.MIN_VALUE;
        } else {
            int max = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            return max; // यहां max को वापस लौटाएँ
        }
    }

    public static int min(int arr[]) {
        if (arr.length == 0) {
            return Integer.MAX_VALUE;
        } else {
            int min = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                }
            }
            return min; // यहां min को वापस लौटाएँ
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of an array:");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int z = max(arr);
        System.out.println("Maximum element is " + z);
        int y = min(arr);
        System.out.println("Minimum element is " + y);
    }
}
