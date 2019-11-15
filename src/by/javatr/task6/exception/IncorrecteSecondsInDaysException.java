package by.javatr.task6.exception;

public class IncorrecteSecondsInDaysException extends Exception {

        public IncorrecteSecondsInDaysException() {
        }

        public IncorrecteSecondsInDaysException(String message) {
            super("ERROR: " + message);
        }

        public IncorrecteSecondsInDaysException(String message, Throwable cause) {
            super("ERROR: " + message, cause);
        }

        public IncorrecteSecondsInDaysException(Throwable cause) {
            super(cause);
        }

}
