package Head02_OOP_Programming.example3;

class Order {
    private String orderID;
    private Delivery delivery;


    public Order(String orderID, String trackingNumber, String carrier) {
        this.delivery = new Delivery(trackingNumber, carrier);
        this.orderID = orderID;
    }

}
