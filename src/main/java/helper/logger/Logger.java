package helper.logger;

public class Logger {

    private static LoggerChain debugLogger = new DebugLogger();
    private static LoggerChain errorLogger = new ErrorLogger().setNextChain(debugLogger);
    private static LoggerChain infoLogger = new InfoLogger().setNextChain(errorLogger);

    public static void log(LoggerLevel level, String message) {
        infoLogger.print(new LoggerController(message, level));
    }
}
