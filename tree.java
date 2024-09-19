import java.util.*;
class tree
{
    public static void main(String[] args) {
        Set<Integer>s=new TreeSet<>();
        s.add(10);
        s.add(20);
        s.add(100);
        s.add(544);
        System.out.println(s.contains(20));
        Iterator<Integer>it=s.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        
    }
}