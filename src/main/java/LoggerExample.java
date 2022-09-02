import java.io.IOException;
import java.util.logging.*;

public class LoggerExample {
    private final static Logger LOGGER = Logger.getLogger(LoggerExample.class.getName());
            static {
                LOGGER.addHandler(new ConsoleHandler());

                try {
                    FileHandler fileHandler = new FileHandler("myLog.log");
                    fileHandler.setFormatter(new SimpleFormatter());
                    LOGGER.addHandler(fileHandler);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
    public static void putSomeLog() {
        LOGGER.info("Just some info" + " some more message");
        LOGGER.log(Level.INFO, "Some more info");
        try {
            int divByZero = 1 / 0;
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, e.getMessage(), e);
        }

    }
    public static void main(String[] args) {
        LOGGER.warning("Some error may come.");
        putSomeLog();
    }

}
