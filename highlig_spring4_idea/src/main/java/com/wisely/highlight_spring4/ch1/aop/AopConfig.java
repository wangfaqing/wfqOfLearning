package com.wisely.highlight_spring4.ch1.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.wisely.highlight_spring4.ch1.aop")
@EnableAspectJAutoProxy //注解开启Spring对AspectJ的支持
public class AopConfig {
}
