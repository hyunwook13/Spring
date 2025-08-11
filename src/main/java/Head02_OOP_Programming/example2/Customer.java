package Head02_OOP_Programming.example2;

class Customer {
    private String name;
    private String product;
    private int quantity;
    private int price;

    public Customer(String name, String product, int quantity, int price) {
        this.name = name;
        this.product = product;
        this.quantity = quantity;
        this.price = price;
    }

    int getTotalPrice() {
        return quantity * price;
    }

    void printOrderSummary() {
        System.out.printf("%s 님이 주문한 %s %d권의 총액은 %d원입니다.\n",
                name, product, quantity, getTotalPrice());
    }
}



//public class ProceduralOrderManager {
//    public static void main(String[] args) {
//        String customer = "Alice";
//        String product = "Book";
//        int quantity = 2;
//        int price = 15000;
//
//        int totalPrice = quantity * price;
//        System.out.printf("%s 님이 주문한 %s %d권의 총액은 %d원입니다.\n",
//                customer, product, quantity, totalPrice);
//    }
//}