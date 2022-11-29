package io.younghwang.springframeworkbasic.user.exception;

public class SqlNotFoundException extends RuntimeException {
    public SqlNotFoundException() {
    }

    public SqlNotFoundException(String s, Throwable cause) {
        super(cause);
    }

    public SqlNotFoundException(String message) {
        super(message);
    }
}
