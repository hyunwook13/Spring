package Lambda;

@FunctionalInterface
interface Calculator {
    int operate(int a, int b);

//    default int add(int a, int b);
}

public class LambdaSyntaxDemo {
    public static void main(String[] args) {
        Calculator add =  (a, b) -> a + b;
        Calculator sub = (a, b) -> {
            System.out.println("sub...");
            return a - b;
        };

        Calculator mul = (a, b) -> a * b;
        Calculator div = (a, b) -> a / b;

        System.out.println("3 + 5 = " + add.operate(3, 5));
        System.out.println("8 - 5 = " + sub.operate(8, 5));
        System.out.println("3 * 5 = " + mul.operate(3, 5));
        System.out.println("20 / 4 = " + div.operate(20, 4));
    }



}
