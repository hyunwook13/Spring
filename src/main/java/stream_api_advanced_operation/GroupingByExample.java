package stream_api_advanced_operation;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Kim", "Lee", "Park", "Kang", "Choi", "Cha");

        Map<Character, List<String>> groued = names.stream()
                .collect(Collectors.groupingBy(name -> name.charAt(0)));

groued.forEach((k, v) -> System.out.println(k + "=" + v));
//        System.out.println(groued);


    }

}
