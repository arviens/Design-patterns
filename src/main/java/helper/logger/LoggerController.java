package helper.logger;

class LoggerController {
    private String message;
    private LoggerLevel level;

    public LoggerController(String message, LoggerLevel level) {
        this.message = message;
        this.level = level;
    }

    public String getMessage() {
        return message;
    }

    public LoggerLevel getLevel() {
        return level;
    }
}
