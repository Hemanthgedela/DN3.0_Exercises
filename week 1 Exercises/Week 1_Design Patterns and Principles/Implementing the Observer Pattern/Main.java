
public class Main {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        Observer mobileApp = new MobileApp("Mobile App");
        Observer webApp = new WebApp("Web App");

        stockMarket.registerObserver(mobileApp);
        stockMarket.registerObserver(webApp);

        stockMarket.setPrice(100.50);
        stockMarket.setPrice(105.75);
    }
}
