package com.eci.cosw.springbootsecureapi.service;
public class UserServiceException extends Exception{
    
    public UserServiceException(String message){
        super(message);
    }

    public UserServiceException(String message, Throwable cause){
        super(message, cause);
    }
}