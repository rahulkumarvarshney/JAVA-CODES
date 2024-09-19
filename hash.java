import java.util.*;

public class hash {
    public static void main(String[] args) {
    Map<Integer,String> s=new HashMap<>();
    s.put(1,"rahul");
    s.put(5,"ramesh");
    for(var key:s.entrySet())
    {
        System.out.println(key+" "+s.get(key));
    }

        

    }
}
