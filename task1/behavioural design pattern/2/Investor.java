import java.util.List;
import java.util.ArrayList;

public class Investor implements Observer {
    private String name;
    private List<Stock> portfolio;
    private double threshold;

    public Investor(String name, double threshold) {
        this.name = name;
        this.threshold = threshold;
        this.portfolio = new ArrayList<>();
    }

    // Add a getName() method to resolve the error
    public String getName() {
        return name;
    }

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

    // Save portfolio to a memento
    public PortfolioMemento savePortfolioToMemento() {
        return new PortfolioMemento(portfolio);
    }

    // Restore portfolio from a memento
    public void getPortfolioFromMemento(PortfolioMemento memento) {
        portfolio = memento.getSavedPortfolio();
    }

    public List<Stock> getPortfolio() {
        return portfolio;
    }
}
