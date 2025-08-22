package stream_api_advanced_operation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectSquareEvenExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 4, 4, 5, 10, 2);

        List<Integer> processed = numbers.stream()
                .distinct()
                .filter(num -> num % 2 == 0)
                .map( num -> num * num )
                .collect(Collectors.toList());

        System.out.println(processed);

    }
}
