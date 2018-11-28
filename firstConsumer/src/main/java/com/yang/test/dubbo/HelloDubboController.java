package com.yang.test.dubbo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/9/11 0011.
 */
@RestController
public class HelloDubboController {
    @Autowired
    private DubboTestService dubboTestService;

    @RequestMapping(name = "/test",method = RequestMethod.GET)
    public String test(@RequestParam String param){
        return  dubboTestService.test(param);
    }


}
