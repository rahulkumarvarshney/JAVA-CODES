import java.util.*;
public class learnqueue {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>(); 
            // q.add(10);
            // q.add(20);
           //  q.add(30);
            q.offer(10);
            q.offer(20);
            q.offer(30);
            System.out.println(q);


            q.poll();
            System.out.println(q);
            System.out.println(q.peek());

            while(!q.isEmpty())
            {
                System.out.println(q.poll());
            }
           // System.out.println(q.poll());
           System.out.println(q.remove());
            
    
    }
}
