package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        MyService myService = context.getBean(MyService.class);
        String message = myService.getMyBeanMessage();
        System.out.println("Received message: " + message);
    }
}
