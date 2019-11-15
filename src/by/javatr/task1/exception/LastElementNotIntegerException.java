package by.javatr.task1.exception;

public class LastElementNotIntegerException extends Exception {
    public LastElementNotIntegerException() {
    }

    public LastElementNotIntegerException(String message) {
        super("ERROR: " + message);
    }

    public LastElementNotIntegerException(String message, Throwable cause) {
        super("ERROR: " + message, cause);
    }

    public LastElementNotIntegerException(Throwable cause) {
        super(cause);
    }
}
