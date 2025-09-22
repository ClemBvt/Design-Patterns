public class LogManager {
    private static LogManager instance;

    // Constructeur privé pour empêcher l'instanciation extérieure
    private LogManager() {
    }

    public static synchronized LogManager getInstance() {
        if (instance == null) {
            instance = new LogManager();
        }
        return instance;
    }

    public void log(String message, LogLevel level) {
        System.out.printf("[%s] %s%n%n", level, message);
    }
}