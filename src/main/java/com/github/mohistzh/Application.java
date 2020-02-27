package com.github.mohistzh;

import com.github.mohistzh.config.annotation.MyUndertow;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author Jonathan
 * @Date 2020/2/27
 **/
@SpringBootApplication(scanBasePackages = "com.github.mohistzh")
@MyUndertow
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
