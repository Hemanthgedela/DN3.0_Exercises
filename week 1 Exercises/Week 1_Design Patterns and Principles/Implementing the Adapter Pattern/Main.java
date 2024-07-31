
public class Main {
    public static void main(String[] args) {
        PaymentProcessor payPalProcessor = new PayPalAdapter(new PayPalGateway());
        payPalProcessor.processPayment(500.00);
        PaymentProcessor stripeProcessor = new StripeAdapter(new StripeGateway());
        stripeProcessor.processPayment(200.00);
        PaymentProcessor squareProcessor = new SquareAdapter(new SquareGateway());
        squareProcessor.processPayment(700.00);
    }
}

