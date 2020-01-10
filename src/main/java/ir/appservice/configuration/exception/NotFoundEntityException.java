package ir.appservice.configuration.exception;

public class NotFoundEntityException extends ModelLayerException {
    public NotFoundEntityException(String message) {
        super(message);
    }
}
