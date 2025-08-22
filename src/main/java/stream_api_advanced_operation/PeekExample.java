package stream_api_advanced_operation;

import java.util.Arrays;
import java.util.List;

public class PeekExample {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("one", "two", "three");

        items.stream().peek(System.out::println).forEach(System.out::println);
    }
}
