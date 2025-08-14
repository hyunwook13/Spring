package Head02_OOP_Programming.solid;

public class PaymentMethodDemo {
    public static void main(String[] args) {
        for (PaymentMethod method : PaymentMethod.values()) {
            System.out.println(method.name() + " 순서 :" + method.ordinal() + " => " + method.getDisplayName());
        }
    }
}
