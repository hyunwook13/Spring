package algorithm;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("apple", 1500);
        map.put("orange", 3000);
        map.put("pear", 4000);
        map.put("apple", 1200);

        System.out.println(map.get("apple"));
        System.out.println(map.containsKey("pear"));
    }
}
