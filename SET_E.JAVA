import java.util.*;
class SET_E
{
    public static void main(String[]args)
    {
        // Set<Integer>s=new HashSet<>(); o(1)
        
        //Set<Integer>s=new LinkedHashSet<>(); o(n)
        Set<Integer>s=new TreeSet<>();   //o(logn)
        s.add(90);
        s.add(10);
        s.add(20);r
        s.add(20);
        System.out.println(s);
        s.remove(10);
        System.out.println(s);
        System.out.println(s.contains(10));
        
    }
}