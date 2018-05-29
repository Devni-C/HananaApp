package org.hanana.hananaapp.exceptions;

public class HananaException extends Exception{
    private String mErrorMessage;

    public HananaException(String errorMessage) {
        super(errorMessage);
        mErrorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return mErrorMessage;
    }
}
