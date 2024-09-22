# Stock Market Portfolio Management (Observer Pattern)

## Project: StockMarketObserverMain
This project demonstrates the Observer Design Pattern to manage a stock trading platform where multiple investors observe stock price changes.

## Use Case: Stock Market Notifications
The system notifies all registered investors when a stock's price changes. Each investor can subscribe or unsubscribe from stock updates, receiving real-time notifications.

## Class Overview
- **StockMarket (Subject)**: Maintains the current stock price and notifies all subscribed investors when the price changes.
- **Investor (Observer)**: Receives notifications whenever the stock price is updated. The investor class can manage a portfolio of stocks.
- **Stock**: Represents individual stocks that investors track in their portfolios.
- **PortfolioManager**: Manages an investor's portfolio and provides subscription or unsubscription features.

## Features
- **Real-time notifications**: Investors are updated instantly when stock prices change.
- **Multiple Stock Tracking**: Investors can follow multiple stocks and receive specific updates.
- **Unsubscribe**: Investors can unsubscribe from notifications for specific stocks.

## How to Run
1. Build and run the project.
2. Add investors and stocks to the StockMarket.
3. Change stock prices and watch notifications being sent to subscribed investors.
