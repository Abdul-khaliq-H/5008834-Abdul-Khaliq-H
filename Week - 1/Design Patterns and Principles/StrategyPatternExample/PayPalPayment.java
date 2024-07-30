package StrategyPatternExample;

public class PayPalPayment implements PaymentStrategy {
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Processing PayPal payment.");
        System.out.println("Email: " + email);
        System.out.println("Amount: $" + amount);
    }
}