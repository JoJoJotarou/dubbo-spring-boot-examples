package com.example;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo
@SpringBootApplication
public class DubboExternalizedConfigExampleApplication {

    public static void main(String[] args) {
        // 启动应用
        SpringApplication.run(DubboExternalizedConfigExampleApplication.class, args);
    }
}
