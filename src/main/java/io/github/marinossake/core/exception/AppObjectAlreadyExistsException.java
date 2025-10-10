package io.github.marinossake.core.exception;


public class AppObjectAlreadyExistsException extends AppGenericException {

    private static final String DEFAULT_CODE = "ALREADY_EXISTS";

    public AppObjectAlreadyExistsException(String code, String message) {
        super(code + DEFAULT_CODE, message);
    }
}
