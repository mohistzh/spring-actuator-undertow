package com.github.mohistzh.config;

import io.undertow.UndertowOptions;
import org.springframework.boot.web.embedded.undertow.UndertowServletWebServerFactory;
import org.springframework.context.annotation.Bean;

/**
 * @Author Jonathan
 * @Date 2020/2/27
 **/
public class UndertowConfig {
    @Bean
    public UndertowServletWebServerFactory embeddedServletContainerFactory() {
        System.out.println("UndertowConfig here.");
        UndertowServletWebServerFactory factory = new UndertowServletWebServerFactory();
        factory.addBuilderCustomizers(builder -> builder.setServerOption(UndertowOptions.RECORD_REQUEST_START_TIME, true));
        return factory;
    }
}
