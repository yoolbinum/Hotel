package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/*
 * EnableAutoConfiguration will intelligently configure beans that you are likely need in Spring app context.
 * ComponentScan annotation will enable automatic scanning for configuration classes to wire up in your Spring app context.
 */
@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
