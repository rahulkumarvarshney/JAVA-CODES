import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

class sort01 {
    public static void main(String[] args) {
        //Integer[] arr={10,5,2,4,30};
       // System.out.println("before sorting: "+Arrays.toString(arr));
       // Arrays.sort(arr);//increasing order
       // Arrays.sort(arr,Collection.reverseOrder());//decreasing order
       //Arrays.sort(arr,2,5);//witin range
       // System.out.println("after soting: "+Arrays.toString(arr));


       ArrayList<Integer> list=new ArrayList();
       list.add(10);
       list.add(0);
       list.add(9);
       list.add(6);
       System.out.println("beore sorting: "+list);
       //Collections.sort(list);
      // Collections.sort(list,Collections.reverseOrder());//desending order
       System.out.println("after sorting:"+list);

    }
    
}
