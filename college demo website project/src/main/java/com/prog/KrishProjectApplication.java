package com.prog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.prog.controller", "com.prog.repository"})
public class KrishProjectApplication {
    public static void main(String[] args) {
        SpringApplication.run(KrishProjectApplication.class, args);
    }
}
