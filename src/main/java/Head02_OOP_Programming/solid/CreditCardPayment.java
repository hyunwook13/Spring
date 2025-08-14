package Head02_OOP_Programming.solid;

import Head02_OOP_Programming.example3.Payment;

public class CreditCardPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("신용카드 결제: " + amount + "원");
    }
}
