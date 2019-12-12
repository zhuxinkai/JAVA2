package com.test.zhuxinkai.controller;

import com.test.zhuxinkai.controller.interception.MyInterceptorl;
import org.springframework.context.annotation.Configuration;

import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyWebMvcConfig implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry){
        registry
                .addResourceHandler("/static/***")
                .addResourceLocations("classpath:/static/");




    }

    @Override
    public void addCorsMappings(CorsRegistry registry){
        System.out.println("全局配置cors方式");
        registry.addMapping("/bookcors/**").allowedHeaders("*").allowedMethods("*").maxAge(1800)
                .allowedOrigins("http://129.0.0.1:8081");

    }

@Override
    public void addInterceptors(InterceptorRegistry registry){
        registry.addInterceptor(new MyInterceptorl()).
                addPathPatterns("/**").
                excludePathPatterns("/hello");


}
}
