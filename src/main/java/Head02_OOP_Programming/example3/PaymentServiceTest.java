//package Head02_OOP_Programming.example3;
//
//public class PaymentServiceTest {
//}

package Head02_OOP_Programming.example3;

public class PaymentServiceTest {
    public static void main(String[] args) {

        try {
            runAll();
        } catch (Throwable t) {
            System.err.println("🔥 Uncaught: " + t.getClass().getName() + " - " + t.getMessage());
            t.printStackTrace();
        }
    }

    static void runAll() {
        UserAccount account = new UserAccount("삼형제");

        PaymentService service = new PaymentService();

        // 0) 현재 잔액 출력 (디버깅에 도움)

        System.out.println("초기 잔액: " + account.getBalance());
        account.deposit(10_000);
        // 1) 정상 입금
        try {
            account.deposit(10_000);
            System.out.println("입금 후 잔액: " + account.getBalance());
        } catch (IllegalArgumentException e) {
            System.out.println("예외 발생 (정상 입금에서?): " + e.getMessage());
        }

        // 2) 음수 입금
        try {
            account.deposit(-5_000);
        } catch (IllegalArgumentException e) {
            System.out.println("예외 발생 (음수 입금): " + e.getMessage());
        }

        // 3) 음수 출금
        try {
            account.withdraw(-10_000);
        } catch (Exception e) {
            System.out.println(e.getClass().getName());
//            System.out.println(e.getLocalizedMessage());

            if (e instanceof IllegalArgumentException) {
                System.out.println(e.getMessage());
            }
            System.out.println("예외 발생 (음수 출금): " + e.getMessage());
        }

        // 4) 잔액 부족 출금 (의도한 케이스로 수정)
        try {
            account.withdraw(account.getBalance() + 1); // 잔액보다 1원 더
        } catch (IllegalStateException | IllegalArgumentException e) {
            System.out.println("예외 발생 (잔액 부족 출금): " + e.getMessage());
        }

        // 5) 정상 결제 (잔액 내 금액으로)
        try {
            service.processPayment(account, 3_000);
            System.out.println("결제 후 잔액: " + account.getBalance());
        } catch (Exception e) { // PaymentService가 throws 한다면 잡기
            System.out.println("예외 발생 (정상 결제): " + e.getMessage());
        }

        // 6) 정상 환불
        try {
            service.processRefund(account, 3_000);
            System.out.println("환불 후 잔액: " + account.getBalance());
        } catch (Exception e) {
            System.out.println("예외 발생 (정상 환불): " + e.getMessage());
        }

    }
}

