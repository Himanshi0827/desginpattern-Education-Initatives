import java.util.ArrayList;
import java.util.List;

public class Investor implements Observer {
    private String name;
    private List<Stock> portfolio; // The list of stocks the investor is following
    private double threshold; // A price change threshold for stock trend notifications

    public Investor(String name, double threshold) {
        this.name = name;
        this.threshold = threshold;
        this.portfolio = new ArrayList<>();
    }

    // This method is called whenever the stock price is updated
    @Override
    public void update(String stockName, double stockPrice) {
        System.out.println(name + " is notified: " + stockName + " price changed to " + stockPrice);
    }

    public void addToPortfolio(Stock stock) {
        portfolio.add(stock);
        System.out.println(name + " added " + stock.getStockName() + " to their portfolio.");
    }

    public void removeFromPortfolio(Stock stock) {
        portfolio.remove(stock);
        System.out.println(name + " removed " + stock.getStockName() + " from their portfolio.");
    }

    public boolean isFollowing(Stock stock) {
        return portfolio.contains(stock);
    }

    public double getThreshold() {
        return threshold;
    }
}
