import java.util.Arrays;

public class SimpleQueue {
    private int[] queue;
    private int front;
    private int rear;
    private int capacity;

    public SimpleQueue(int size) {
        queue = new int[size];
        capacity = size;
        front = 0;
        rear = -1;
    }

    // Enqueue operation
    public void enqueue(int item) {
        if (rear == capacity - 1) {
            System.out.println("Queue is full");
            return;
        }
        queue[++rear] = item;
    }

    // Dequeue operation
    public int dequeue() {
        if (front > rear) {
            System.out.println("Queue is empty");
            return -1;
        }
        return queue[front++];
    }

    // Peek operation
    public int peek() {
        if (front > rear) {
            System.out.println("Queue is empty");
            return -1;
        }
        return queue[front];
    }

    // isEmpty operation
    public boolean isEmpty() {
        return front > rear;
    }

    public static void main(String[] args) {
        SimpleQueue queue = new SimpleQueue(5);

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println("Front element: " + queue.peek());  // Output: 1

        System.out.println("Removed element: " + queue.dequeue());  // Output: 1

        // Show logical state of the queue
        System.out.print("Queue after dequeue: ");
        for (int i = queue.front; i <= queue.rear; i++) {
            System.out.print(queue.queue[i] + " ");
        }
        System.out.println();

        System.out.println("Is queue empty? " + queue.isEmpty());  // Output: false
    }
}
