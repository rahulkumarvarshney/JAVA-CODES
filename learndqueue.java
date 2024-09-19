import java.util.ArrayDeque;

public class learndqueue {
    public static void main(String[] args) {
        ArrayDeque<Integer>dq=new ArrayDeque<>();
        // dq.offer(10);
        // dq.offerLast(30);
        // dq.offerFirst(20);
        // System.out.println(dq);
        // dq.poll();
        // dq.pollLast();
        // dq.pollFirst();
        // System.out.println(dq);

        dq.push(30);
        dq.push(20);
        dq.push(10);
       
        System.out.println(dq);
        dq.pop();
        System.out.println(dq);
        dq.peek();
        System.out.println(dq);
    }
}
