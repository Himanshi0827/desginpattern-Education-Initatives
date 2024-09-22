import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StockMarket {
    private Map<Stock, List<Observer>> stockObserversMap; // Map of stock to observers
    private Map<Stock, Double> previousPrices; // Store previous stock prices for trend comparison

    public StockMarket() {
        stockObserversMap = new HashMap<>();
        previousPrices = new HashMap<>();
    }

    // Register an investor to a particular stock
    public void addObserver(Stock stock, Observer observer) {
        stockObserversMap.computeIfAbsent(stock, k -> new ArrayList<>()).add(observer);
    }

    // Remove an investor from a particular stock
    public void removeObserver(Stock stock, Observer observer) {
        List<Observer> observers = stockObserversMap.get(stock);
        if (observers != null) {
            observers.remove(observer);
        }
    }

    // Notify observers of a particular stock when the price changes
    public void notifyObservers(Stock stock, double oldPrice, double newPrice) {
        List<Observer> observers = stockObserversMap.get(stock);
        if (observers != null) {
            for (Observer observer : observers) {
                Investor investor = (Investor) observer;
                // Notify only if the price change exceeds the investor's threshold
                if (Math.abs(newPrice - oldPrice) > investor.getThreshold()) {
                    investor.update(stock.getStockName(), newPrice);
                }
            }
        }
    }

    // Update stock price and notify respective observers
    public void setStockPrice(Stock stock, double newPrice) {
        double oldPrice = previousPrices.getOrDefault(stock, stock.getStockPrice());
        previousPrices.put(stock, newPrice);
        stock.setStockPrice(newPrice);
        System.out.println("StockMarket: " + stock.getStockName() + " price updated to " + newPrice);
        notifyObservers(stock, oldPrice, newPrice);
    }
}
