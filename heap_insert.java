import java.util.Scanner;

class heap_insert {
    
    // Insert function for Max-Heap
    static void insert(int arr[], int n, int number) {
        n = n + 1;
        arr[n] = number;
        int i = n;
        while (i > 1) {
            int parent = i / 2;
            if (arr[parent] < arr[i]) {
                // Swap arr[i] and arr[parent]
                int temp = arr[i];
                arr[i] = arr[parent];
                arr[parent] = temp;
                i = parent;
            } else {
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        
        int arr[] = new int[n + 2]; // +2 to handle 1-based index and extra element
        System.out.println("Enter array elements:");
        for (int i = 1; i <= n; i++) { // Using 1-based index
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter number to insert:");
        int number = sc.nextInt();
        insert(arr, n, number);

        System.out.println("Array after insertion:");
        for (int i = 1; i <= n + 1; i++) { // Print 1-based index array
            System.out.print(arr[i] + " ");
        }
    }
}
