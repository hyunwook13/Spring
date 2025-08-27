package Lambda;

import java.util.List;
import java.util.Arrays;

public class StreamBasicExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Tom", "Jerry", "kim","ToobsDay");

        names.stream()
                .filter(name -> name.startsWith("T"))
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
