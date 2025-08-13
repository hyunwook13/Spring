package solid;

public class PaymentProcessorTest {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();

        processor.pay(PaymentType.creditcard, 10000);
    }
}
