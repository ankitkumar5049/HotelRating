package com.lcwd.user.service.exceptions;

public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(){
        super("Resource not found exception!!");
    }

    public ResourceNotFoundException(String msg){
        super(msg);
    }
}
