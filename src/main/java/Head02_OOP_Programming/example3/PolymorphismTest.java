//package Head02_OOP_Programming.example3;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class PolymorphismTest {
//    public static void main(String[] args) {
//        OrderService service = new OrderService();
//
//        List<Payment>  payments = Arrays.asList(
//                new CreditCardPayment(),
//                new AccountTransferPayment()
//        );
//
//        int[] ammounts = {
//                10000,
//                20000
//        };
//
//        for(Payment payment : payments) {
//            if (payment instanceof CreditCardPayment) {
//                service.processPayment(payment, ammounts[0]);
//            } else {
//                service.processPayment(payment, ammounts[1]);
//            }
//        }
//    }
//}