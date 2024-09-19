import java.util.*;

public class learntree {
    public static void main(String[] args) {
        Set<Integer>s=new TreeSet<>();
        s.add(56);
        s.add(20);
        s.add(10);
        s.add(50);
        s.add(20);
        Iterator<Integer>itr=s.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
