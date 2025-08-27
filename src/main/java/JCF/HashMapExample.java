package JCF;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap example = new HashMap();
        example.put("key1", "value1");
        example.put("key2", "value2");
        example.put("key3", "value3");
        example.put("key4", "value4");
        example.put("key5", "value5");
        System.out.println(example);

        example.put("key1", "change1");

        System.out.println(example.get("key1"));


        if (example.containsKey("key4")) {
            System.out.println("I GOT IT");
        } else {
            System.out.println("Oh nono");
        }

        example.remove("key1");

        System.out.println(example);

        System.out.println(example.keySet());

        example.size();

    }
}
