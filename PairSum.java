import java.util.HashSet;

public class PairSum {
    public static void main(String[] args) {
        int[] array = {10, 2, 3, 7, 8, 5};
        int sum = 12;

        if (hasPairWithSum(array, sum)) {
            System.out.println("Array has two elements with the given sum.");
            System.out.println(hasPairWithSum(array, sum));
        } else {
            System.out.println("Array does not have two elements with the given sum.");
        }
    }

    public static boolean hasPairWithSum(int[] array, int sum) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : array) {
            int complement = sum - num;

            if (set.contains(complement)) {
                return true;
            }
            set.add(num);
        }

        return false;
    }
}