package exception;

public class SameCityException extends UnsupportedOperationException {

    public SameCityException() {
    }

    public SameCityException(String message) {
        super(message);
    }

    public SameCityException(String message, Throwable cause) {
        super(message, cause);
    }

    public SameCityException(Throwable cause) {
        super(cause);
    }
}
