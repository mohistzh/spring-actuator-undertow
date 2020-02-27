package com.github.mohistzh.config.annotation;

import com.github.mohistzh.config.UndertowConfig;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Import(UndertowConfig.class)
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface MyUndertow {
}
