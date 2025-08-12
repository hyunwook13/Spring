package Head02_OOP_Programming.example3;

public class Topic03ExampleMain {
    public static void main(String[] args) {
        UserProfile profile = new UserProfile("이현욱", "1234");

        profile.printUserInfo();
    }
}

class AccountTransferPayment implements Payment {

    @Override
    public int pay(int amount) throws Exception {
        System.out.println("계좌이체로 " + amount + "원 결제 완료.");
        return 0;
    }
}