package week13.Lab.Task01;

public class Logger {
    private static Logger instance;

    private Logger() {
    }

    public static Logger getInstance() {
        synchronized (Logger.class) {
            if(instance == null) {
                instance = new Logger();
            }
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("Message: " + message);
    }
    public void logInfo(String message) {
        System.out.println("Informational: " + message);
    }
    public void logWarning(String message) {
        System.out.println("Warning: " + message);
    }
    public void logError(String message) {
        System.out.println("Error: " + message);
    }
}
