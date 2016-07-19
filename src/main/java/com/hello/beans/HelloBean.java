package com.hello.beans;


public class HelloBean {

    private String message;

    public HelloBean(){
        this.message = "Hello World";
    }
    public HelloBean(String name){
        this.message = "Hello World! Welcome "+ name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
