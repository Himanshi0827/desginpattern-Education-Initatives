import java.util.Stack;

public class StockManager {
    private Stack<StockMemento> stockHistory = new Stack<>();

    // Save the stock price state
    public void saveStockPrice(Stock stock) {
        stockHistory.push(stock.saveStockPriceToMemento());
        System.out.println("Stock price saved for " + stock.getStockName());
    }

    // Restore the last saved stock price
    public void restoreStockPrice(Stock stock) {
        if (!stockHistory.isEmpty()) {
            stock.getStockPriceFromMemento(stockHistory.pop());
            System.out.println("Stock price restored for " + stock.getStockName());
        } else {
            System.out.println("No saved stock price to restore.");
        }
    }
}
