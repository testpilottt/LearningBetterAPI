package com.example.DataJPA.SQLDriver.SpringWeb.Thymeleaf.data.payloads.response;

public class mHeadsetResponse {
    private String message;

    public mHeadsetResponse(String message){
        this.message = message;
    }

    public void setMessage(String message){
        this.message = message;
    }

    public String getMessage(){
        return message;
    }

}
