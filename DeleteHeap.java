import java.util.Scanner;

public class DeleteHeap {
    
    static void delete(int arr[], int n) {
        if (n == 0) {
            System.out.println("Heap is empty");
            return;
        }
        
        // Replace the root of the heap with the last element
        arr[0] = arr[n - 1];
        n = n - 1;
        
        int i = 0;
        while (i<= n) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            
            // Check if right child exists and is larger
            int larger = (right < n && arr[right] > arr[left]) ? right : left;
            
            if (arr[i] < arr[larger]) {
                // Swap arr[i] and arr[larger]
                int temp = arr[i];
                arr[i] = arr[larger];
                arr[larger] = temp;
                i = larger;
            } else {
                break;
            }
        }
        
        // Print the array after deletion for demonstration purposes
        System.out.println("Array after deletion:");
        for (int j = 0; j < n; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        delete(arr, n);
    }
}
