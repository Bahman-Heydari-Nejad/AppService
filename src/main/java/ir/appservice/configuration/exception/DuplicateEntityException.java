package ir.appservice.configuration.exception;

public class DuplicateEntityException extends ModelLayerException {
    public DuplicateEntityException(String message) {
        super(message);
    }
}
