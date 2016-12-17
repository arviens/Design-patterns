package helper.logger;

import java.util.Date;

public class ErrorLogger implements LoggerChain {

    private LoggerChain nextChain;

    public LoggerChain setNextChain(LoggerChain chain) {
        nextChain = chain;
        return this;
    }

    //TODO add null object dp
    public void print(LoggerController loggerController) {
        if (loggerController.getLevel() == LoggerLevel.ERROR) {
            System.out.println("[ERROR] [" + dtf.format(new Date()) + "] " + loggerController.getMessage());
        } else if (nextChain != null) {
            nextChain.print(loggerController);
        }
    }
}