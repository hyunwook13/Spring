package example6;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

public class FilterMapExample {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Tom", 90);
        scores.put("Jerry", 80);
        scores.put("kim", 70);

        Predicate<Map.Entry<String, Integer>> highScore = new Predicate<Map.Entry<String, Integer>>() {
            @Override
            public boolean test(Map.Entry<String, Integer> entry) {
                return entry.getValue() >= 80;
            }
        };

        scores.entrySet().stream()
                        .filter(entry -> entry.getValue() > 80)
                .forEach(entry -> System.out.println("High Scorer: " + entry.getKey() + " => " + entry.getValue()));

        scores.entrySet().stream()
                .filter(highScore)
                .forEach(entry -> System.out.println(entry.getKey()));
    }
}
