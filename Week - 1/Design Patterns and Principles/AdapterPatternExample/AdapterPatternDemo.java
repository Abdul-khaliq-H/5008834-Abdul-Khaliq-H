package AdapterPatternExample;

public class AdapterPatternDemo {
    public static void main(String[] args) {
        // Create instances of payment gateways
        PayPalPaymentGateway payPalPaymentGateway = new PayPalPaymentGateway();
        StripePaymentGateway stripePaymentGateway = new StripePaymentGateway();

        // Create adapters for each payment gateway
        PaymentProcessor payPalAdapter = new PayPalAdapter(payPalPaymentGateway);
        PaymentProcessor stripeAdapter = new StripeAdapter(stripePaymentGateway);

        // Process payments through adapters
        payPalAdapter.processPayment(100.00);
        stripeAdapter.processPayment(200.00);
    }
}

// Output:
// Processing payment of $100.0 through PayPal.
// Charging $200.0 using Stripe.
