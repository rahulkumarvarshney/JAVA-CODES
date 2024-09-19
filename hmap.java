import java.util.*;

class hmap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
       map.put("rahul", 1);
        map.put("manish", 2);
        System.out.println(map);
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
        for (int i = 0; i < map.size(); i++) {
            System.out.println(map.get(i));
        }
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key + " " + map.get(key));
        }
        if (!map.containsKey("suresh")) {
            System.out.println("this is not present is here");
        }
        System.out.println(map.get("rahul"));
        System.out.println(map.getOrDefault("rahul", 2));
    }
}