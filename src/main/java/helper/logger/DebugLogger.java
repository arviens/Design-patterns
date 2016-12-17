package helper.logger;

import java.util.Calendar;
import java.util.Date;

public class DebugLogger implements LoggerChain {

    private LoggerChain nextChain;

    public LoggerChain setNextChain(LoggerChain chain) {
        nextChain = chain;
        return this;
    }

    public void print(LoggerController loggerController) {
        if (loggerController.getLevel() == LoggerLevel.DEBUG) {
            System.out.println("[DEBUG] [" + dtf.format(new Date()) + "] " + loggerController.getMessage());
        } else if (nextChain != null) {
            nextChain.print(loggerController);
        }
    }
}