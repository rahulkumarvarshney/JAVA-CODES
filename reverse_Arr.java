import java.util.Arrays;

public class reverse_Arr {
    public static int[] reversearray(int arr[]) {
        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        return arr; // यहां arr को वापस लौटाएँ
    }

    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40,50,70};
         arr = reversearray(arr); // reversearray का परिणाम arr में अपडेट करें
        
        // परिणाम को प्रिंट करें
        System.out.println("Reversed array: " +Arrays.toString(arr));
    }
}
