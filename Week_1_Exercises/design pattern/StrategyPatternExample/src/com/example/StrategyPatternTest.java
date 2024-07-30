package com.example;

public class StrategyPatternTest {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        PaymentStrategy creditCardPayment = new CreditCardPayment("9876-6542-2222-1123");
        context.setPaymentStrategy(creditCardPayment);
        context.pay(400.0);

        PaymentStrategy payPalPayment = new PayPalPayment("rwiddhibagchi17@gmail.com");
        context.setPaymentStrategy(payPalPayment);
        context.pay(2000.0);
    }
}

