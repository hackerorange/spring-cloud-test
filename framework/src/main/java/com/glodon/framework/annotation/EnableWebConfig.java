package com.glodon.framework.annotation;

import com.glodon.framework.web.GlobalWebConfig;
import org.springframework.context.annotation.Import;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Documented
@Target(value = ElementType.TYPE)
@Import(GlobalWebConfig.class)
public @interface EnableWebConfig {
}
