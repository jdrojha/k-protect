package com.kprotect.appuserservice.util.exceptions;

/***
 * @Author Rajesh Ojha
 * @Date 7 Sep 21
 */
public class InvalidInputException extends RuntimeException {
    public InvalidInputException() {
    }

    public InvalidInputException(String message) {
        super(message);
    }

    public InvalidInputException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidInputException(Throwable cause) {
        super(cause);
    }
}
