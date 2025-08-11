package Head02_OOP_Programming.example2;

public class OOPOrderManager {
    public static void main(String[] args) {
        Customer order = new Customer("Alice", "Book", 2, 15000);
        order.printOrderSummary();
    }
}