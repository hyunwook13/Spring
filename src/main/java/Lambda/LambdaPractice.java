package Lambda;

import java.util.Arrays;
import java.util.List;

public class LambdaPractice {

    public void print(String name) {
        System.out.println(name);
    }

    public boolean lengthCheck(String name) {
        return name.length() >= 5;
    }

    public String toUpper(String name) {
        return name.toUpperCase();
    }

    public static void main(String[] args) {
        LambdaPractice practice = new LambdaPractice();

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        names.stream()
                .forEach(practice::print);

        names.stream()
                .map(practice::toUpper)
                .forEach(practice::print);

        names.stream().filter(practice::lengthCheck).forEach(practice::print);

    }

}

//public class LambdaPractice {
//    public static void main(String[] args) {
//        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
//
//        // 1. Consumer - 출력
//        Consumer<String> print = new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        };
//        names.forEach(print);
//
//        // 2. Predicate - 이름 길이 5 이상 필터링
//        Predicate<String> lengthCheck = new Predicate<String>() {
//            @Override
//            public boolean test(String s) {
//                return s.length() >= 5;
//            }
//        };
//        names.stream().filter(lengthCheck).forEach(System.out::println);
//
//        // 3. Function - 이름을 대문자로 변환
//        Function<String, String> toUpper = new Function<String, String>() {
//            @Override
//            public String apply(String s) {
//                return s.toUpperCase();
//            }
//        };
//        names.stream().map(toUpper).forEach(System.out::println);
//    }
//}
