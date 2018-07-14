package com.wisely.highlight_spring4.ch2.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class DemonPublisher {
    @Autowired
    ApplicationContext applicationContext;

    public void pulish(String msg){
        applicationContext.publishEvent(new DemonEvent(this, msg));
    }

}
