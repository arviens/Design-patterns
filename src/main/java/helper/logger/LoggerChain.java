package helper.logger;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

interface LoggerChain {
    DateFormat dtf = new SimpleDateFormat("HH:mm:ss");

    LoggerChain setNextChain(LoggerChain chain);

    void print(LoggerController loggerController);
}
