package ir.appservice.configuration.exception;

public class InvalidTokenException extends ViewLayerException {
    public InvalidTokenException(String token) {
        super(String.format("Token [%s] in Invalid!", token));
    }
}
