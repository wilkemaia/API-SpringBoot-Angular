package com.project.bootcamp.bootcamp.exceptions;

public class ExceptionResponse {

    private  String message;

    public  ExceptionResponse(String message){
        this.message= message;
    }

    public String getMessage() {
        return message;
    }


}
