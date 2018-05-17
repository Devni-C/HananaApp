package org.hanana.hananaapp.exceptions;

public class HananaException extends Exception{
    private String mErrorMessage;

    public HananaException(String message, String errorMessage) {
        super(message);
        mErrorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return mErrorMessage;
    }
}
