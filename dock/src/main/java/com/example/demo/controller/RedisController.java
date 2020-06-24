package com.example.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.entity.RedisEntity;
import com.example.demo.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/redis")
public class RedisController {
    @Autowired
    RedisUtil redisUtil;

    @RequestMapping(value = "/redisSave", method = RequestMethod.POST)
    public String docker(@RequestBody RedisEntity redisEntity){
        // 当前时间戳
        String startTs = String.valueOf(System.currentTimeMillis());
        // 对象转JSON字符串
        String jsonStr = JSONObject.toJSONString(redisEntity);
        redisUtil.set(startTs,jsonStr);
        return startTs;
    }

    @RequestMapping(value = "/queryRedis/{key}", method = RequestMethod.GET)
    public String docker(@PathVariable("key") String key){
        String jsonStr = redisUtil.get(key);
        return jsonStr;
    }
}
