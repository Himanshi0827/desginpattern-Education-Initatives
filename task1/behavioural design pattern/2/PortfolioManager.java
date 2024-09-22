import java.util.Stack;

public class PortfolioManager {
    private Stack<PortfolioMemento> portfolioHistory = new Stack<>();

    // Save the portfolio state
    public void savePortfolio(Investor investor) {
        portfolioHistory.push(investor.savePortfolioToMemento());
        System.out.println("Portfolio saved for " + investor.getName());
    }

    // Restore the last saved portfolio state
    public void restorePortfolio(Investor investor) {
        if (!portfolioHistory.isEmpty()) {
            investor.getPortfolioFromMemento(portfolioHistory.pop());
            System.out.println("Portfolio restored for " + investor.getName());
        } else {
            System.out.println("No saved portfolio to restore.");
        }
    }
}
