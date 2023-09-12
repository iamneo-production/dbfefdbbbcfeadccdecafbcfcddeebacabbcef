package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyService {
    private MyBean myBean;

    @Autowired
    public MyService(MyBean myBean) {
        this.myBean = myBean;
    }

    public String getMyBeanMessage() {
        return myBean.getMessage();
    }
}
