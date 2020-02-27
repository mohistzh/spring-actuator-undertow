package com.github.mohistzh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author Jonathan
 * @Date 2020/2/27
 **/
@SpringBootApplication
@ComponentScan("com.github.mohistzh")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
