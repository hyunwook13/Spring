package stream_api_advanced_operation;

import java.util.Arrays;
import java.util.List;

public class InstanceMethodRefDemo {
    int doubleValue(int x) {
        System.out.println(x * 2);
        return x;
    }

    public static void main(String[] args) {
        InstanceMethodRefDemo demo = new InstanceMethodRefDemo();
        List<Integer> list = Arrays.asList(10, 20, 30);
//        Function<Integer, Void> f1 =

        list.forEach(demo::doubleValue);

        list.forEach(num ->
                demo.doubleValue(num)
        );
    }
}
