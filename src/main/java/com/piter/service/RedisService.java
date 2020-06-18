package com.piter.service;

import com.piter.dto.User;
import com.piter.util.RedisOperator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RedisService {
    @Autowired
    private RedisOperator redisOperator;

    public void redisAddKey(String key, String value) {
        redisOperator.set(key, value);
    }

    public String redisGetKey(String key) {
        String redisValue = (String) redisOperator.get(key);
        return redisValue;
    }

    public void redisAddUser(String key, Object value) {
        redisOperator.set(key, value);
    }

    public User redisGetUser(String key) {
        User redisValue = (User) redisOperator.get(key);
        return redisValue;
    }


}
