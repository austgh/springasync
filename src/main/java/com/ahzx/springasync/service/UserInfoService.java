package com.ahzx.springasync.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @author think
 * @version 1.0
 * @date 2022/3/20 21:51
 */
@Service
public class UserInfoService {
    private final Logger log = LoggerFactory.getLogger(UserInfoService.class);
//    @Async(value="why")
    @Async(value="${thread-pool.name}")
    public void save(){
        log.info("当前线程名称:{}", Thread.currentThread().getName());
    }
}
