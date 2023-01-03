package com.ahzx.springasync;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

/**
 * @author think
 * @version 1.0
 * @date 2022/3/20 21:44
 */
@Configuration
public class AppConfig {
    private final Logger log = LoggerFactory.getLogger(AppConfig.class);
    @Bean(value="why")
    public Executor myExecutor(){
        return new ThreadPoolTaskExecutor();
    }

}
