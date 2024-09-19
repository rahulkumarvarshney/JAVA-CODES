import java.util.*;

public class hsubarray {

    static void subArraysum(int arr[], int sum) {
        int currentSum = 0;
        int start = 0;
        int end = -1;
        HashMap<Integer, Integer> hs = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];

            if (currentSum - sum == 0) {
                start = 0;
                end = i;
                break;
            }

            if (hs.containsKey(currentSum - sum)) {
                start = hs.get(currentSum - sum) + 1;
                end = i;
                break;
            }

            hs.put(currentSum, i);
        }

        if (end == -1) {
            System.out.println("No subarray with the given sum exists");
        } else {
            System.out.println("Subarray found between indices " + start + " and " + end);
        }
    }

    public static void main(String[] args) {
        int arr[] = {10, 15, -5, 15, -10, 5};
        int sum = 20;
        subArraysum(arr, sum);
    }
}
