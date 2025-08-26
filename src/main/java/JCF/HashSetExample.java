package example6;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

    public static void main(String[] args) {
        Set<String> setTo =  new HashSet<String>();

        setTo.add("Korea");
        setTo.add("Korea");
        setTo.add("USA");
        setTo.add("UK");

        System.out.println(setTo);

        setTo.remove("Korea");

        System.out.println(setTo);

        System.out.println(setTo.size());
    }
}
