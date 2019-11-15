package by.javatr.task2.exception;

public class NoMonthException extends Exception {
    public NoMonthException() {
    }

    public NoMonthException(String message) {
        super("ERROR: " + message);
    }

    public NoMonthException(String message, Throwable cause) {
        super("ERROR: " + message, cause);
    }

    public NoMonthException(Throwable cause) {
        super(cause);
    }
}
