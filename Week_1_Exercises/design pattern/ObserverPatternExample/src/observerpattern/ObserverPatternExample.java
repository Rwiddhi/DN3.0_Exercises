package observerpattern;

public class ObserverPatternExample {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        Observer mobileApp1 = new MobileApp("ZLibrary");
        Observer mobileApp2 = new MobileApp("PythonShop");
        Observer webApp1 = new WebApp("EasyShare");

        stockMarket.register(mobileApp1);
        stockMarket.register(mobileApp2);
        stockMarket.register(webApp1);

        stockMarket.setStockPrice(200.00);
        stockMarket.setStockPrice(250.50);

        stockMarket.deregister(mobileApp1);

        stockMarket.setStockPrice(300.00);
    }
}
