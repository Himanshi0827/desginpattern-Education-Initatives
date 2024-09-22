public class StockMarketObserverMain {
    public static void main(String[] args) {
        // Create a stock market
        StockMarket stockMarket = new StockMarket();

        // Create some stocks
        Stock googleStock = new Stock("Google", 1500.00);
        Stock appleStock = new Stock("Apple", 200.00);

        // Create investors with specific thresholds
        Investor investor1 = new Investor("Alice", 50.00); // Alice wants to be notified of price changes greater than
                                                           // 50
        Investor investor2 = new Investor("Bob", 20.00); // Bob wants to be notified of price changes greater than 20
        Investor investor3 = new Investor("Charlie", 30.00); // Charlie wants to be notified of price changes greater
                                                             // than 30

        // Add stocks to investor portfolios
        investor1.addToPortfolio(googleStock);
        investor2.addToPortfolio(googleStock);
        investor3.addToPortfolio(appleStock);

        // Register investors to specific stocks
        stockMarket.addObserver(googleStock, investor1);
        stockMarket.addObserver(googleStock, investor2);
        stockMarket.addObserver(appleStock, investor3);

        // Update stock prices and notify respective investors
        stockMarket.setStockPrice(googleStock, 1550.00); // Notifies Alice (threshold > 50), not Bob
        stockMarket.setStockPrice(appleStock, 210.00); // Notifies Charlie (threshold > 30)

        // Unsubscribe an investor from Google stock
        investor2.removeFromPortfolio(googleStock);
        stockMarket.removeObserver(googleStock, investor2);
        stockMarket.setStockPrice(googleStock, 1600.00); // Notifies only Alice (Bob has unsubscribed)

        // Further price change that does not exceed threshold
        stockMarket.setStockPrice(appleStock, 212.00); // No notification (change is less than Charlie's threshold)
    }
}
