package solid;

import Head02_OOP_Programming.example3.Payment;

public class AccountTransferPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("계좌이체 결제: " + amount + "원");
    }
}

//class AccountTransferPayment implements Payment {
//
//    @Override
//    public int pay(int amount) throws Exception {
//        System.out.println("계좌이체로 " + amount + "원 결제 완료.");
//        return 0;
//    }
//}