package com.example.provider;

import com.example.NameService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class NameServiceImpl implements NameService {
    @Override
    public String sayName(String name) {
        return "Hi, " + name;
    }
}
