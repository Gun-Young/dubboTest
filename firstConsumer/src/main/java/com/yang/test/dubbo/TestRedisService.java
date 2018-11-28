package com.yang.test.dubbo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2018/9/15 0015.
 */
@Component
public class TestRedisService {
    @Autowired
    private StringRedisTemplate redisTemplate;

    public String getByKey(String key){
        return redisTemplate.opsForValue().get(key);
    }
}
