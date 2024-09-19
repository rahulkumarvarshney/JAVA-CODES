import java.util.*;

public class has_union {
    
        public static int unio(int arr[],int brr[])
        {
            Set<Integer>s=new HashSet<>();
            for(int element:arr)
            {
                s.add(element);
            }
            for(int elements:brr)
            {
                s.add(elements);
            }
            System.out.println(s);
            return s.size();
            
        }

        public static void main(String[] args) {
            int arr[]={5,10,15,5};
            int brr[]={10,15,4};
            int v=unio(arr,brr);
            System.out.println(v);
        }
        
    }

