public class StockMemento {
    private final double stockPrice;

    public StockMemento(double stockPrice) {
        this.stockPrice = stockPrice;
    }

    public double getSavedStockPrice() {
        return stockPrice;
    }
}
