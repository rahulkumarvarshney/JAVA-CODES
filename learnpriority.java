import java.util.PriorityQueue;
import java.util.Queue;

public class learnpriority {
    public static void main(String[] args) {
        Queue<Integer> p=new PriorityQueue<>((a,b)->b-a);
        p.add(40);
        p.add(20);
        p.add(30);
        System.out.println(p);
        p.poll();
        System.out.println(p);

    }
}
