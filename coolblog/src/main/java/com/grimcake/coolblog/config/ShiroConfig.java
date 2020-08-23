package com.grimcake.coolblog.config;

import com.grimcake.coolblog.shiro.MyRealm;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class ShiroConfig {
    @Bean
    public SecurityManager securityManager(MyRealm realm) {
        return null;
    }
}
