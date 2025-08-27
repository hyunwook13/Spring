package JCF;

import java.util.List;
import java.util.function.Consumer;

public class ForEachFruitsExample {
    public static void main(String[] args) {
        List<String> fruits = List.of("Apple", "Banana", "Cherry");

        Consumer<String> printConsumer = new Consumer<String>() {
            @Override
            public void accept(String fruit) {
                System.out.println("Fruit: " + fruit);
            }
        };

        fruits.stream().forEach(printConsumer);


    }
}
