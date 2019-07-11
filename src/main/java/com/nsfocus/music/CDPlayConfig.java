package com.nsfocus.music;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackageClasses = CDPlayConfig.class)
@ComponentScan(basePackages = "com.nsfocus")
public class CDPlayConfig {
}
