package example6;

import java.util.function.Function;

public class StaticMethodRefDemo {
    public static int doubleValue(int x) {
        return x * 2;
    }

    public static void main(String[] args) {
        Function<Integer, Integer> f1 = StaticMethodRefDemo::doubleValue;

        System.out.println(f1.apply(10));
        Function<Integer, Integer> f2 = num -> StaticMethodRefDemo.doubleValue(num);
        System.out.println(f2.apply(30));


    }
}
