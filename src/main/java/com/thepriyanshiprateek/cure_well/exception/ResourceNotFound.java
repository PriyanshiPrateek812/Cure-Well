package com.thepriyanshiprateek.cure_well.exception;

public class ResourceNotFound  extends RuntimeException{
    private String resourceName;
    private String fieldName;
    private Long fieldValue;

    public ResourceNotFound(String resourceName, String fieldName, Long fieldValue){
        super(String.format("%s not found with %s:'%s'", resourceName, fieldName, fieldValue));
        this.resourceName=resourceName;
        this.fieldName=fieldName;
        this.fieldValue=fieldValue;
    }
}