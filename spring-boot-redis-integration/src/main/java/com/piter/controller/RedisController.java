package com.piter.controller;

import com.piter.dto.User;
import com.piter.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("redis")
public class RedisController {

    @Autowired
    RedisService redisService;

    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String redisAdd(@RequestParam String key, @RequestParam String value){
        redisService.redisAddKey(key, value);


        return redisService.redisGetKey(key);
    }

    @RequestMapping(value = "addObject", method = RequestMethod.POST)
    public User redisAdd(@RequestParam String key, @RequestBody User user){
        redisService.redisAddUser(key, user);
        return redisService.redisGetUser(key);
    }
}
