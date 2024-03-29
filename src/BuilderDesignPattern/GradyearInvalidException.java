package BuilderDesignPattern;

public class GradyearInvalidException extends RuntimeException{
    public GradyearInvalidException() {
    }

    public GradyearInvalidException(String message) {
        super(message);
    }

    public GradyearInvalidException(String message, Throwable cause) {
        super(message, cause);
    }

    public GradyearInvalidException(Throwable cause) {
        super(cause);
    }

    public GradyearInvalidException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
