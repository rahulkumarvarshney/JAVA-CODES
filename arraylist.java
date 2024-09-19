import java.util.*;
 class arraylist {
   public static void main(String[] args) {
    
        ArrayList<Object> l1=new ArrayList<>();
            l1.add(20);
            l1.add(5);
            l1.add("rahul");
            System.out.println(l1);
            Iterator<Object>it=l1.iterator();
            while(it.hasNext())
            {
              System.out.println(it.next());
            }

   } 
}
