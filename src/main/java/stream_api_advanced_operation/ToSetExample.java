package stream_api_advanced_operation;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ToSetExample {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple", "Banana", "Apple", "Cherry", "Banana");

        Set<String> uniqueFruits = fruits.stream()
                        .collect(Collectors.toSet());

        String result = uniqueFruits.stream().collect(Collectors.joining(", "));

        System.out.println("Unique fruits: " + uniqueFruits);
        System.out.println(result);
    }
}