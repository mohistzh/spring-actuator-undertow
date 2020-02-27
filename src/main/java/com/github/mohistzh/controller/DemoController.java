package com.github.mohistzh.controller;

import io.undertow.server.handlers.MetricsHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Jonathan
 * @Date 2020/2/27
 **/
@RestController
public class DemoController {

    @GetMapping(path = "/")
    public String home() {
        return "Welcome home";
    }
}
