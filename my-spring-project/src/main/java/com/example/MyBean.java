package com.example;

import org.springframework.stereotype.Component;

@Component
public class MyBean {
    private String message = "Hello from MyBean!";

    public String getMessage() {
        return message;
    }
}
