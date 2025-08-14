package Head02_OOP_Programming.solid;

import Head02_OOP_Programming.example3.Payment;

public class MobilePayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("모바일 결제: " + amount + "원");
    }
}