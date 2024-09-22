public class Stock {
    private String stockName;
    private double stockPrice;

    public Stock(String stockName, double stockPrice) {
        this.stockName = stockName;
        this.stockPrice = stockPrice;
    }

    public String getStockName() {
        return stockName;
    }

    public double getStockPrice() {
        return stockPrice;
    }

    public void setStockPrice(double stockPrice) {
        this.stockPrice = stockPrice;
    }

    // Create a memento to save the current stock price
    public StockMemento saveStockPriceToMemento() {
        return new StockMemento(stockPrice);
    }

    // Restore stock price from a memento
    public void getStockPriceFromMemento(StockMemento memento) {
        this.stockPrice = memento.getSavedStockPrice();
    }
}
