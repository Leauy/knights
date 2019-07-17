package com.nsfocus.aop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan
@EnableAspectJAutoProxy
public class AopConfig {
    @Bean
    public Audience audience(){
        return new Audience();
    }
}
