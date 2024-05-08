package com.example;

import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo1Controller {

    @DubboReference
    private Demo1Service demoService;

    @GetMapping("/say")
    public String sayHello(String name) {
        return demoService.sayHello(name);
    }
}
