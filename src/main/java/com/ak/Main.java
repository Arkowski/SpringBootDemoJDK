package com.ak;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@EnableAutoConfiguration
@SpringBootApplication
//@ComponentScan("com.ak.topics")


public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}
