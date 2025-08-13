package Head02_OOP_Programming.example3;

public class UserAccount {
    private final String accountId;
    private double balance;

    public UserAccount(String accountId) {
        this.accountId = accountId;
        this.balance = 0;
    }

    public void deposit(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("0보다 커야 합니다.");
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= 0 || balance < amount) throw new IllegalStateException("출금 오류.");
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}