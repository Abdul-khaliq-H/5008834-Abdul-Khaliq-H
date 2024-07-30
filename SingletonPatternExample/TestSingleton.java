package SingletonPatternExample;


public class TestSingleton {
    public static void main(String[] args) {

        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();


        if (logger1 == logger2) {
            System.out.println("Logger has a single instance.");
        } else {
            System.out.println("Logger instances are different.");
        }


        logger1.log("This is the first log message.");
        logger2.log("This is the second log message.");
    }
}

