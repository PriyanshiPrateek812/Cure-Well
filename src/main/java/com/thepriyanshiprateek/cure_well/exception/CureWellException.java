package com.thepriyanshiprateek.cure_well.exception;

import org.springframework.http.HttpStatus;
public class CureWellException extends RuntimeException{
    private HttpStatus status;
    private String message;

    public CureWellException(String customMessage, HttpStatus status, String message){
        super(customMessage);
        this.status=status;
        this.message=message;
    }
}
