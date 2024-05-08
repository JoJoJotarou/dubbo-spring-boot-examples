package com.example;

import com.example.config.NacosConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("config")
public class ConfigController {

    @Autowired
    private NacosConfiguration nacosConfiguration;

    @GetMapping("/get")
    public boolean get() {
        return nacosConfiguration.getUseLocalCache();
    }
}
