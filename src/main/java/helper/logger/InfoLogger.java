package helper.logger;

import java.util.Date;

public class InfoLogger implements LoggerChain {

    private LoggerChain nextChain;

    public LoggerChain setNextChain(LoggerChain chain) {
        nextChain = chain;
        return this;
    }

    public void print(LoggerController loggerController) {
        if (loggerController.getLevel() == LoggerLevel.INFO) {
            System.out.println("[INFO] [" + dtf.format(new Date()) + "] " +  loggerController.getMessage());
        } else if (nextChain != null) {
            nextChain.print(loggerController);
        }
    }
}