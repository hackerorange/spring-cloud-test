package com.glodon.framework.web;

import com.glodon.framework.web.interceptor.WebLastInterceptor;
import com.glodon.framework.web.interceptor.WebLogInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class GlobalWebConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new WebLogInterceptor()).addPathPatterns("/**");
        registry.addInterceptor(new WebLastInterceptor()).addPathPatterns("/**");
    }
}
