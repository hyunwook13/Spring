package Head02_OOP_Programming.example3;

public class OrderService {
    public void processPayment(Payment method, int amount) {
        try {
            method.pay(amount);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}