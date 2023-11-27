
import java.io.*;
import java.util.*;

class Stock {
    String stockName;
    int numberOfShares;
    double sharePrice;

    Stock(String stockName, int numberOfShares, double sharePrice) {
        this.stockName = stockName;
        this.numberOfShares = numberOfShares;
        this.sharePrice = sharePrice;
    }

    double calculateStockValue() {
        return numberOfShares * sharePrice;
    }
}

class StockPortfolio {
    List<Stock> stocks;

    StockPortfolio() {
        stocks = new ArrayList<>();
    }

    void addStock(Stock stock) {
        stocks.add(stock);
    }

    double calculateTotalPortfolioValue() {
        double totalValue = 0;
        for (Stock stock : stocks) {
            totalValue += stock.calculateStockValue();
        }
        return totalValue;
    }

    void printStockReport() {
        for (Stock stock : stocks) {
            System.out.println("Stock: " + stock.stockName);
            System.out.println("Number of Shares: " + stock.numberOfShares);
            System.out.println("Share Price: $" + stock.sharePrice);
            System.out.println("Total Value: $" + stock.calculateStockValue());
            System.out.println("------------------------");
        }
        System.out.println("Total Portfolio Value: $" + calculateTotalPortfolioValue());
    }
}

public class StockAccount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StockPortfolio stockPortfolio = new StockPortfolio();

        System.out.print("Enter the number of stocks: ");
        int numStocks = scanner.nextInt();

        for (int i = 0; i < numStocks; i++) {
            System.out.println("Enter details for Stock " + (i + 1) + ":");
            System.out.print("Stock Name: ");
            String stockName = scanner.next();
            System.out.print("Number of Shares: ");
            int numberOfShares = scanner.nextInt();
            System.out.print("Share Price: $");
            double sharePrice = scanner.nextDouble();

            Stock stock = new Stock(stockName, numberOfShares, sharePrice);
            stockPortfolio.addStock(stock);
        }

        System.out.println("\nStock Report:");
        stockPortfolio.printStockReport();
    }
}

