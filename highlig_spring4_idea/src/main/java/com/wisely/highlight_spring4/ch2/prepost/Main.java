package com.wisely.highlight_spring4.ch2.prepost;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PrePostConfig.class);
        BeanWayService beanWayService = context.getBean(BeanWayService.class);
        JSR50WayService jsr50WayService = context.getBean(JSR50WayService.class);

        context.close();
    }



}
