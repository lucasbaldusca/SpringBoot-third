package com.example.projetojpa3tent.service.exceptions;

public class ObjectNotFoundException extends RuntimeException {

    //Construtor
    public ObjectNotFoundException(String msg) {
        super(msg);
    }

    public ObjectNotFoundException(String msg, Throwable cause) {
        super(msg, cause);
    }


}
