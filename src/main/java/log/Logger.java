package log;

public class Logger {
    private static Logger instance;

    private Logger() {

    }

    public void log(String log) {
        System.out.println(log);
    }

    public static Logger getInstance() {

        if (instance == null) {

            synchronized (Logger.class) {

                if (instance == null) {

                    return new Logger();

                }

            }

        }

        return instance;

    }
}
