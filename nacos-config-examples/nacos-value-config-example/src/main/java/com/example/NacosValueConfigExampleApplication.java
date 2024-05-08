package com.example;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@NacosPropertySource(dataId = "example-value-config.yml", autoRefreshed = true)
public class NacosValueConfigExampleApplication {
    public static void main(String[] args) {
        SpringApplication.run(NacosValueConfigExampleApplication.class, args);
    }
}