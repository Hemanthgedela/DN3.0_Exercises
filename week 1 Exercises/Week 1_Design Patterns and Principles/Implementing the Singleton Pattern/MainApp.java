public class MainApp {
    public static void main(String[] args) {
             Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        System.out.println("Logger 1 instance: " + logger1.hashCode());
        System.out.println("Logger 2 instance: " + logger2.hashCode());

        logger1.log("Logging message 1");
        logger2.log("Logging message 2");
    }
}