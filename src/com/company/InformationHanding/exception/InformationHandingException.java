package com.company.InformationHanding.exception;

public class InformationHandingException extends Exception{

    public InformationHandingException(){
        super();
    }

    public InformationHandingException(String massage){
        super(massage);
    }

    public InformationHandingException(String message, Throwable cause){
        super(message,cause);
    }

    public  InformationHandingException(Throwable cause){
        super(cause);
    }
}
