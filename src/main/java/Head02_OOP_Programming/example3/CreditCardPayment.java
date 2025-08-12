package Head02_OOP_Programming.example3;

public class CreditCardPayment implements  Payment {
    int currentMoney = 100000;

    @Override
    public int pay(int amount) throws Exception {
        if (amount <= 0) {
            throw new Exception("Invalid amount");
        } else if (currentMoney - amount <= 0) {
            throw new Exception("No Money");
        }

        int tempMoney = currentMoney - amount;
        System.out.println("카드로 " + amount + "원 결제 완료.");
        System.out.println("잔액은 " + tempMoney);
        return currentMoney - amount;
    }
}

abstract class