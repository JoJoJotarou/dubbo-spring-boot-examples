package com.example.consumer;

import com.example.DemoService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @DubboReference
    private DemoService demoService;

    @GetMapping("say")
    public String sayHello(String name) {
        return demoService.sayHello(name);
    }
}
