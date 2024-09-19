import java.util.*;

public class has_distinct {


    public static int Distinct(int arr[]) {
        Set<Integer> s = new HashSet<>();

        for(int element:arr)
        {
            s.add(element);
        }
        System.out.println(s);
        // Iterator<Integer>itr=arr.Iterator();
        // while(itr.hasNext())
        // {
        //     System.out.println(itr.next());
        // }
        return s.size();
        
    }
    public static void main(String[] args) {
        int ar[] = {10, 10, 20, 40, 30, 40};
        int v = Distinct(ar);
        System.out.println("Number of distinct elements: " + v);
        
    }
    
    
}
