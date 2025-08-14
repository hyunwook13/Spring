package Head02_OOP_Programming.solid;

public class PaymentProcessorTest {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();

        processor.pay(PaymentMethod.CREDIT_CARD, 10000);
    }
}
