import java.util.*;

public class hash_intersect {

       public static int intersect(int arr[],int brr[])
        {
            
                Set<Integer>s=new HashSet<>();
                int count=0;
                for(int element:arr)
                {
                    s.add(element);
                }
                for(int element:brr)
                {
                    
                    s.contains(element);
                    count++;
                    s.remove(element);
                }
                
            
                return count;
        }

    public static void main(String[] args) {
        int arr[]={5,10,15,4,5};
        int brr[]={5,10,15,4};
       int v= intersect(arr,brr);
       System.out.println(v);
    }
}
