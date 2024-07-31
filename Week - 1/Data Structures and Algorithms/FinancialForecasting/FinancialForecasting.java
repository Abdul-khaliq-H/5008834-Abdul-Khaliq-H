package FinancialForecasting;

public class FinancialForecasting {

    // Recursive method to calculate future value
    public static double calculateFutureValue(double initialValue, double growthRate, int periods) {
        if (periods == 0) {
            return initialValue;
        } else {
            return calculateFutureValue(initialValue, growthRate, periods - 1) * (1 + growthRate);
        }
    }

    public static void main(String[] args) {
        double initialValue = 1000.0; // Initial value
        double growthRate = 0.05; // Growth rate of 5%
        int periods = 10; // Number of periods

        double futureValue = calculateFutureValue(initialValue, growthRate, periods);
        System.out.println("Future Value: " + futureValue);
    }
}

// Output:
// Future Value: 1628.8946267774422