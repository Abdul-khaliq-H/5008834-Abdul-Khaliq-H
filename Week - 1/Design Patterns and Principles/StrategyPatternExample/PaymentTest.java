package StrategyPatternExample;

public class PaymentTest {
    public static void main(String[] args) {
        // Test Credit Card Payment
        PaymentStrategy creditCardPayment = new CreditCardPayment("1234-5678-9876-5432", "John Doe");
        PaymentContext paymentContext = new PaymentContext(creditCardPayment);
        paymentContext.executePayment(250.75);

        System.out.println();

        // Test PayPal Payment
        PaymentStrategy payPalPayment = new PayPalPayment("john.doe@example.com");
        paymentContext.setPaymentStrategy(payPalPayment);
        paymentContext.executePayment(150.50);
    }
}

// Output:
// Processing credit card payment.
// Card Number: 1234-5678-9876-5432
// Card Holder: John Doe
// Amount: $250.75

// Processing PayPal payment.
// Email: john.doe@example.com
// Amount: $150.5