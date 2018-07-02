package com.wisely.highlight_spring4.ch1.aop;

import org.springframework.stereotype.Service;

/**
 * 使用注解的被拦截类
 */
@Service
public class DemonAnnotationService {
    @Action(name="注解式拦截的add操作")
    public void add(){
        System.out.println("====DemonAnnotationService add 有Action注解");
    }
}
