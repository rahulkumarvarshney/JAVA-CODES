import java.util.*;
public class map {
   // Map<Object,Object>m=new HashMap<>();
    // map()
    // {
    //     m.put(10, 20);
    //     m.put(2, "rahul");
    // }
public static void main(String[] args) {
    // map p=new map();
    // System.out.println(p.m);
    Map<Object,Object>m=new HashMap<>();
    m.put(10, 20);
    m.put(2,"rahul");
    m.put(3, "rahul");
   // m.clear();
  // System.out.println(m.get(2));
  //System.out.println(m.size());
  //System.out.println(m.hashCode());
  //System.out.println(m.containsKey(3));
  //Iterator<Object,Object>ob=m
  
  System.out.println(m.entrySet());
    System.out.println(m);
}
}
