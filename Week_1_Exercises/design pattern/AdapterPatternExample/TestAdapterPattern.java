public class TestAdapterPattern {
    public static void main(String[] args) {
        PaymentProcessor payPalProcessor = new PayPalAdapter(new PayPalGateway());
        PaymentProcessor stripeProcessor = new StripeAdapter(new StripeGateway());

        payPalProcessor.processPayment(9000);
        stripeProcessor.processPayment(27000);
    }
}
