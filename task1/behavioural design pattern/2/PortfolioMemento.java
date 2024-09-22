import java.util.ArrayList;
import java.util.List;

public class PortfolioMemento {
    private final List<Stock> savedPortfolio;

    public PortfolioMemento(List<Stock> portfolio) {
        // Save a deep copy of the portfolio list
        this.savedPortfolio = new ArrayList<>(portfolio);
    }

    public List<Stock> getSavedPortfolio() {
        return savedPortfolio;
    }
}
