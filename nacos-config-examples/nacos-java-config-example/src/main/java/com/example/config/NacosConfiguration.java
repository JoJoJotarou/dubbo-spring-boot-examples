package com.example.config;

import com.alibaba.nacos.api.config.annotation.NacosConfigurationProperties;
import lombok.Data;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@NacosConfigurationProperties(dataId = "example-java-config.yml", groupId = "example", autoRefreshed = true)
public class NacosConfiguration {

    private Boolean useLocalCache;
}
