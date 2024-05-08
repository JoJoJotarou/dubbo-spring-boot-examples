package com.example;

import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class Demo1ServiceImpl implements Demo1Service {
    @Override
    public String sayHello(String name) {
        return "Hi, " + name + "." + "This is dubbo-externalized-configuration-example";
    }
}
