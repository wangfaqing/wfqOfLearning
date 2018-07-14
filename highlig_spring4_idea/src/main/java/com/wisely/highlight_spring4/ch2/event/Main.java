package com.wisely.highlight_spring4.ch2.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);
        DemonPublisher demonPublisher = context.getBean(DemonPublisher.class);
        demonPublisher.pulish("hello application event");
        context.close();
    }

}
