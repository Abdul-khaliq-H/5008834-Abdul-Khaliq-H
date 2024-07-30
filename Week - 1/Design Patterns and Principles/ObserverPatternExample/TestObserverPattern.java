package ObserverPatternExample;

public class TestObserverPattern {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        MobileApp mobileApp = new MobileApp("Stock Mobile App");
        WebApp webApp = new WebApp("Stock Web App");

        stockMarket.registerObserver(mobileApp);
        stockMarket.registerObserver(webApp);

        System.out.println("Setting stock price to $100.00");
        stockMarket.setStockPrice(100.00);

        System.out.println("Deregistering WebApp...");
        stockMarket.deregisterObserver(webApp);

        System.out.println("Setting stock price to $150.00");
        stockMarket.setStockPrice(150.00);
    }
}

// Output:
// Setting stock price to $100.00
// Stock Mobile App received stock price update: $100.0
// Stock Web App received stock price update: $100.0
// Deregistering WebApp...
// Setting stock price to $150.00
// Stock Mobile App received stock price update: $150.0

