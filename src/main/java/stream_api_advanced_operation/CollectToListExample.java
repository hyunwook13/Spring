package stream_api_advanced_operation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectToListExample {
    public static void main(String[] args) {
        List<String> data = Arrays.asList("a", "b", "c", "b");

        data.stream()
                .distinct()
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
