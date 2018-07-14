package com.wisely.highlight_spring4.ch2.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class ProfileConfig {

    @Bean
    @Profile("dev")
    public DemonBean devDemonBean(){
        return new DemonBean("from development profile");
    }

    @Bean
    @Profile("prod")
    public DemonBean prodDemonBean(){
        return new DemonBean("from production profile");
    }
}
