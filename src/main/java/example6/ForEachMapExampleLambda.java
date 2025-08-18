package example6;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class ForEachMapExampleLambda {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Apple", 40);
        scores.put("Banana", 30);
        scores.put("Cherry", 20);
        scores.put("ASDSDAd", 123);

        Consumer<Map.Entry<String, Integer>> printConsumer = new Consumer<Map.Entry<String, Integer>>() {
            @Override
            public void accept(Map.Entry<String, Integer> entry) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        };

        scores.entrySet().stream()
                .filter(entry -> entry.getValue() > 80)
                .forEach(printConsumer);

    }
}

@FunctionalInterface
interface StringAction {
    void run(String input);

    default void info() {
        System.out.println("ㅁㄴㅇㅁㄴㅇ");
    }

    static void help() {
        System.out.println("ASDASD");
    }
}

//@FunctionalInterface
//interface StringAction2 {
//    void runt1();
//    void runt2();
//}