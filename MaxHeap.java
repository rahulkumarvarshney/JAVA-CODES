import java.util.Arrays;

public class MaxHeap {
    public static void main(String[] args) {
        int[] array = {4, 10, 3, 5, 1};
        buildMaxHeap(array);
        System.out.println("Max-Heap array: " + Arrays.toString(array));
    }

    // Function to build a Max-Heap from the given array
    public static void buildMaxHeap(int[] array) {
        int n = array.length;
        // Perform reverse level order traversal from the last non-leaf node and heapify each node
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(array, n, i);
        }
    }

    // Function to heapify a subtree rooted with node i which is an index in array[]
    public static void heapify(int[] array, int n, int i) {
        int largest = i;  // Initialize largest as root
        int left = 2 * i + 1;  // left child
        int right = 2 * i + 2;  // right child

        // If left child is larger than root
        if (left < n && array[left] > array[largest]) {
            largest = left;
        }

        // If right child is larger than largest so far
        if (right < n && array[right] > array[largest]) {
            largest = right;
        }

        // If largest is not root
        if (largest != i) {
            // Swap the elements
            int swap = array[i];
            array[i] = array[largest];
            array[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(array, n, largest);
        }
    }
}

