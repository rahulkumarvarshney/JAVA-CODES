public class Binary_tree {
    static class Node {
        Integer data; // Integer इस्तेमाल करते हैं ताकि null मान लिया जा सके
        Node left;
        Node right;

        // Constructor to initialize the node with data
        Node(Integer data) {
            this.data = data;
            left = right = null;
        }
    }

    // Static method to build tree from array using recursion
    public static Node buildTree(Integer[] arr, int index) {
        if (index >= arr.length || arr[index] == null) {
            return null;
        }

        Node node = new Node(arr[index]);

        // Recursively build the left and right subtrees
        node.left = buildTree(arr, 2 * index + 1);
        node.right = buildTree(arr, 2 * index + 2);

        return node;
    }

    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, null, 8}; // Example array with a null value
        Node root = buildTree(arr, 0);

        // Print the data to verify
        System.out.println("Root node data: " + (root != null ? root.data : "null"));
        System.out.println("Left child of root: " + (root.left != null ? root.left.data : "null"));
        System.out.println("Right child of root: " + (root.right != null ? root.right.data : "null"));
        System.out.println("Left child of left child: " + (root.left != null && root.left.left != null ? root.left.left.data : "null"));
        System.out.println("Right child of left child: " + (root.left != null && root.left.right != null ? root.left.right.data : "null"));
        System.out.println("Left child of right child: " + (root.right != null && root.right.left != null ? root.right.left.data : "null"));
        System.out.println("Right child of right child: " + (root.right != null && root.right.right != null ? root.right.right.data : "null"));
    }
}
