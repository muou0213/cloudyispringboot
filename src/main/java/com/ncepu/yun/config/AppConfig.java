package com.ncepu.yun.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.DelegatingFilterProxy;

@Configuration
public class AppConfig {
    @Bean
    public DelegatingFilterProxy testRequestFilterDelegatingFilterProxy() {
        DelegatingFilterProxy testRequestFilter = new DelegatingFilterProxy("testRequestFilter");
        return testRequestFilter;
    }
}
