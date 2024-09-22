import java.util.ArrayList;
import java.util.List;

public class StockMarket {
    private List<Investor> investors = new ArrayList<>();
    private List<Stock> stocks = new ArrayList<>();

    // Add an investor to the stock market (observer)
    public void addInvestor(Investor investor) {
        investors.add(investor);
    }

    // Remove an investor from the stock market
    public void removeInvestor(Investor investor) {
        investors.remove(investor);
    }

    // Notify all investors of a stock price update
    public void notifyInvestors(String stockName, double stockPrice) {
        for (Investor investor : investors) {
            investor.update(stockName, stockPrice);
        }
    }

    // Method to update stock prices and notify investors
    public void updateStockPrice(Stock stock, double newPrice) {
        stock.setStockPrice(newPrice);
        System.out.println("StockMarket: " + stock.getStockName() + " price updated to " + newPrice);
        notifyInvestors(stock.getStockName(), newPrice);
    }
}
