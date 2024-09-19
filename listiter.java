import java.util.*;

public class listiter {
    public static void main(String[] args) {
        List<String> fruits=new Vector<>();
        Stack<String> fs=new Stack<>();
        fruits.add("kiwi");
        fruits.add("banana");
        fruits.add("grapess");
        fruits.add("apple");
        fruits.add("orange");

        for(int i=0; i<fruits.size(); i++)
        {
            System.out.println(fruits.get(i));
        }
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        Iterator<String> fe=fruits.listIterator();
        while(fe.hasNext())
        {
            System.out.println(fe.next());
        }
        fs.push("rahul");
        fs.push("varshney");
        //fs.peek();
            fs.pop();
        System.out.println(fs);


    }
}
