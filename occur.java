import java.util.*;

public class occur {
    public static int occurance(int arr[], int n) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {  // Corrected the loop to start from 0
            if (arr[i] == n) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please enter the size:");
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        
        System.out.println("Please enter the array elements:");
        for (int i = 0; i < arr.length; i++) {  // Corrected the loop to start from 0
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Please enter the number you want to count the occurrence of:");
        int k = sc.nextInt();
        
        int count = occurance(arr, k);
        
        System.out.println("The number " + k + " appears " + count + " times in the array.");
    }
}
