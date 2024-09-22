### Stock Market Portfolio Management (Memento & Observer Patterns)

#### Project: StockMarketObserverMementoMain
This project combines the Observer and Memento Design Patterns to manage both stock price notifications and the ability to save/restore investor portfolios.

#### **Use Case: Saving and Restoring Stock Prices and Investor Portfolios**
The system allows investors to track stock prices in real-time (Observer) and to save and restore their stock portfolios (Memento).

#### **Class Overview**:
1. **StockMarket (Subject)**: Notifies investors when stock prices change.
2. **Investor (Observer)**: Subscribes to stock price changes and can manage their stock portfolio.
3. **PortfolioMemento**: Stores a snapshot of an investor's portfolio for future restoration.
4. **PortfolioManager**: Manages the saving and restoring of investor portfolios using the Memento pattern.
5. **Stock**: Represents individual stocks tracked by investors.

#### **Features**:
- **Stock Price Notification**: Uses the Observer pattern to notify investors of price changes.
- **Portfolio Save/Restore**: Uses the Memento pattern to allow investors to save their portfolio states and restore them later.
- **Unsubscribe Feature**: Investors can unsubscribe from stock notifications.

#### **How to Run**:
1. Build and run the project.
2. Add investors and stocks to the StockMarket.
3. Change stock prices to trigger notifications.
4. Use `PortfolioManager` to save or restore an investor’s stock portfolio at any time.
