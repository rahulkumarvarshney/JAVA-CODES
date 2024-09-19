import java.util.*;

public class dis_slidewindow {

    static void countdistinctelement(int arr[], int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Initialize the first window
        for (int i = 0; i < k; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        // Print the number of distinct elements in the first window
        System.out.println(map.size());

        // Slide the window
        for (int i = k; i < arr.length; i++) {
            // Remove the element that is sliding out of the window
            if (map.get(arr[i - k]) == 1) {
                map.remove(arr[i - k]);
            } else {
                map.put(arr[i - k], map.get(arr[i - k]) - 1);
            }
            // Add the new element that is sliding into the window
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            // Print the number of distinct elements in the current window
            System.out.println(map.size());
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 1, 3, 1, 1, 3};
        int k = 4;
        countdistinctelement(arr, k);
    }
}
