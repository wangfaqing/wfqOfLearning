package com.wisely.highlight_spring4.ch2.el;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import javax.annotation.Resource;

@Configuration
@ComponentScan("com.wisely.highlight_spring4.ch2.el")
@PropertySource("classpath:com/wisely/highlight_spring4/ch2/el/test.properties")
public class ElConfig {
    @Value("I hate you!")
    private String normal;

    @Value("#{systemProperties['os.name']}")
    private String osName;

    @Value("#{ T(java.lang.Math).random() * 100.0 }")
    private double randomNumber;

    @Value("#{demonService.another}")
    private String fromAnother;

    @Value("classpath:com/wisely/highlight_spring4/ch2/el/test.txt")
    private Resource testFile;

    @Value("http://www.baidu.com")
    private String testUrl;

    @Value("${book.name}")
    private String bookName;

    @Autowired
    private Environment environment;

}
