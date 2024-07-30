package observerpattern;

public class MobileApp implements Observer {
    private String name;

    public MobileApp(String name) {
        this.name = name;
    }

    @Override
    public void update(double stockPrice) {
        System.out.println("MobileApp " + name + "Updates of stock price received: " + stockPrice);
    }
}
