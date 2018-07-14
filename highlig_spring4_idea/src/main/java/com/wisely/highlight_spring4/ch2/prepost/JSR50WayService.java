package com.wisely.highlight_spring4.ch2.prepost;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class JSR50WayService {
    @PostConstruct
    public void intit(){
        System.out.println("jsr250-init-method");
    }

    public JSR50WayService() {
        super();
        System.out.println("初始化构造函数JSR50WayService");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("jsr250-destroy-methos");
    }
}
