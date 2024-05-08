package com.example;

import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("mock")
public class MockConsumerController {

    @DubboReference
    private MockService mockService;

    @GetMapping
    public String mock() {
        return mockService.sayHello("123");
    }
}
