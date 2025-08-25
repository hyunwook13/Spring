package generic;

import java.util.List;
import java.util.function.Function;

public class PrinterAfterGenericMethod {
    public static <T> void printList(List<T> list, Function<T, String> formatter) {
        list.forEach(t -> System.out.println(formatter.apply(t)));
    }
}
