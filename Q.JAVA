import java.util.*;
class Q
{
    public static void main(String[]args)
    {
        Queue<Integer>q=new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.offer(40);
        // System.out.println(q);
        // for(int i=0; i<q.size(); i++)
        // {
        //     q.remove(i);
        //     System.out.println(q);
        // }
        // System.out.println(q);
        // q.remove();
        // q.remove();
        // q.remove();
        // q.remove();
        // q.remove();
        // q.poll();
        // q.poll();
        // q.poll();
        // q.poll();
        // q.poll();
            q.peek();
        System.out.println(q);
        System.out.println(q.peek());

        
    }
}