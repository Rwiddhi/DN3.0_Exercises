public class loggertest {
    public static void main(String[] args) {
        logger logger1 = logger.getInstance();
        logger logger2 = logger.getInstance();

        // Test logging
        logger1.log("First log message.");
        logger2.log("Second log message.");

        if (logger1 == logger2) {
            System.out.println("Both First log and Second log are of the same instance.");
        } else {
            System.out.println("First log and Second log are different instances.");
        }
    }
}

