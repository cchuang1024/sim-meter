package edu.nccu.cs.simmeter.exception;

import lombok.Getter;

public class SystemException extends Exception{
    @Getter
    private String message;
    @Getter
    private Throwable cause;

    public SystemException(String message) {
        super(message);
        this.message = message;
    }

    public SystemException(Throwable cause) {
        super(cause);
        this.cause = cause;
    }

    public SystemException(String message, Throwable cause) {
        super(message, cause);
        this.cause = cause;
        this.message = message;
    }
}
