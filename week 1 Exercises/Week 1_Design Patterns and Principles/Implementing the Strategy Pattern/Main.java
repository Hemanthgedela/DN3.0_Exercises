
public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();
        PaymentStrategy creditCardPayment = new CreditCardPayment("John snow", "1234567890123456", "786", "12/23");
        context.setPaymentStrategy(creditCardPayment);
        context.pay(100);
        PaymentStrategy payPalPayment = new PayPalPayment(Kinginthe@example.com", "North");
        context.setPaymentStrategy(payPalPayment);
        context.pay(200);
    }
}
