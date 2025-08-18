package stream_api_advanced_operation;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortedCustomExample {
    public static void main(String[] args) {
        List<String> cities = Arrays.asList("Seoul", "Busan", "New York", "London");

        cities.stream()
                .sorted(
                        Comparator.comparingInt(String::length)
                                .thenComparing(Comparator.naturalOrder())
                )
                .forEach(System.out::println);


    }
}
