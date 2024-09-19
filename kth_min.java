import java.util.*;

 class kth_min {
    public static int min(int arr[], int key) {
        // Create a max-heap with reverse order comparator
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        
        // Add the first key elements to the max-heap
        for (int i = 0; i < key; i++) {
            maxHeap.add(arr[i]);
        }
        
        // Process the remaining elements
        for (int i = key; i < arr.length; i++) {
            if (arr[i] < maxHeap.peek()) {
                maxHeap.poll(); // Remove the largest element from the heap
                maxHeap.add(arr[i]); // Add the current element to the heap
            }
        }
        
        // The root of the max-heap is the Kth smallest element
        return maxHeap.peek();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the value of key:");
        int key = sc.nextInt();
        System.out.println("The " + key + "th smallest element is " + min(arr, key));
    }
}
