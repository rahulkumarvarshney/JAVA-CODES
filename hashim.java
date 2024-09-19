import java.util.*;

public class hashim {
    public static void main(String[] args) {

        int Distinct(int arr[])
        {
            Set<Integer>s=new HashSet<>();
            for( int element:arr)
            {
                s.add(element);
            }
            return s.size();
        
        }
        
        int ar[]={10,10,20,40,30,40};
        int v=Distinct(ar);
        
    }
}
