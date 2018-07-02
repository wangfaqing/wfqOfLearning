package com.wisely.highlight_spring4.ch1.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
        DemonAnnotationService demonAnnotationService = context.getBean(DemonAnnotationService.class);
        DemonMethodService demonMethodService = context.getBean(DemonMethodService.class);

        demonAnnotationService.add();
        demonMethodService.add();
        context.close();
    }
}
