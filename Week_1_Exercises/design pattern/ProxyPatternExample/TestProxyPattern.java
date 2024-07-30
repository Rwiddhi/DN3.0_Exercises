public class TestProxyPattern {
    public static void main(String[] args) {
        Image image = new ProxyImage("birds.png");

        image.display();
        image.display();
    }
}
