package com.wisely.highlight_spring4.ch2.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfig.class);

        DemonSingletonService s1 = context.getBean(DemonSingletonService.class);
        DemonSingletonService s2 = context.getBean(DemonSingletonService.class);

        DemonPrototypeService p1 = context.getBean(DemonPrototypeService.class);
        DemonPrototypeService p2 = context.getBean(DemonPrototypeService.class);

        System.out.println("s1与s2是否相等：" + s1.equals(s2));
        System.out.println("p1与p2是否相等：" + p1.equals(p2));
    }
}
