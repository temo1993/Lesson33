package service;

import java.util.HashMap;
import java.util.Map;

class StockServiceHelper {
    static void addStock(Stock stock) {
        stocks.put(stock.getSymbol(), stock);
    }

    public static void removeStock(String symbol) {
        stocks.remove(symbol);
    }

    static Stock getStock(String symbol) {
        return stocks.get(symbol);
    }

    private static Map<String, Stock> stocks = new HashMap<>();

    static {
        generateStocks();
    }

    private static void generateStocks() {
        addStock(new Stock("IBM", 43.12, "USD", "USA"));
        addStock(new Stock("AAPL", 120.0, "USD", "USA"));
     }
}
