public class StockMarketObserverMain {
    public static void main(String[] args) {
        // Create a stock market
        StockMarket stockMarket = new StockMarket();

        // Create stocks
        Stock googleStock = new Stock("Google", 1500.00);
        Stock appleStock = new Stock("Apple", 200.00);

        // Create investors
        Investor investor1 = new Investor("Alice", 50.00);
        Investor investor2 = new Investor("Bob", 20.00);

        // Add stocks to investor portfolios
        investor1.addToPortfolio(googleStock);
        investor2.addToPortfolio(appleStock);

        // Managers for portfolio and stock states
        PortfolioManager portfolioManager = new PortfolioManager();
        StockManager stockManager = new StockManager();

        // Save initial states
        portfolioManager.savePortfolio(investor1);
        stockManager.saveStockPrice(googleStock);

        // Modify stock prices and portfolios
        googleStock.setStockPrice(1600.00);
        investor1.addToPortfolio(appleStock);

        // Restore the previous states
        portfolioManager.restorePortfolio(investor1);
        stockManager.restoreStockPrice(googleStock);

        System.out.println("Final Stock Price: " + googleStock.getStockPrice());
        System.out.println("Investor1 Portfolio: " + investor1.getPortfolio().size() + " stocks.");
    }
}
