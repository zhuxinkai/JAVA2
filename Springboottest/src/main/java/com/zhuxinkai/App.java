package com.zhuxinkai;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;


// @EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
/*解决报错问题，spring boot会默认加载org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration
类使用了@Configuration注解向spring注入了dataSource bean,因为工程中没有关于dataSource相关的配置信息，
当spring创建dataSource bean因缺少相关的信息就会报错
因此我们需要在Application类上面增加注解
*/

/*
解决方案2 ，在pom.xml文件中，注释掉关于jdbc的注入
 */
@SpringBootApplication

public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class,args);
    }
}
/*

@EnableAutoConfiguration  注解标识开启自动化配置。由于项目中添加了 spring-boot-starter-web 依赖，因此在开启了自动化
配置之后，会自动进行Spring 和Spring mvc 的配置。

在Java 项目的main 方法中，通过SpringApplication 中的run 方法启动项目。 第一个参数传入App.class , 告诉Spring 哪个是主要组件。
第二个参数是运行时输入的其他参数。


 */
