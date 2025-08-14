package Head02_OOP_Programming.solid;

public enum PaymentMethod {
//    creditcard, accountTransfer, mobilePay
//    - **조건**
//            - **`PaymentMethod` 이름의 Enum 클래스 구현**
    CREDIT_CARD("신용카드"), ACCOUNT_TRANSFER("계좌 이체"), MOBILE_PAYMENT("모바일 결제");

    private final String displayName;

    // 생성자: enum 상수마다 displayName 초기화
    PaymentMethod(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}