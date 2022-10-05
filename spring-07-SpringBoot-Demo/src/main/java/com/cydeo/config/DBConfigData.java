package com.cydeo.config;

import lombok.Data;
import org.springframework.aop.target.LazyInitTargetSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;
@Data
@Configuration
@ConfigurationProperties(prefix = "db")
public class DBConfigData {

    private String username;
    private String password;
    private List<String> type;
}
