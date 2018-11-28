package com.yang.test.dubbo;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2018/9/11 0011.
 */

@Component
public class DubboTestService {
    @Reference(version = "1.0.0")
    private HelloDubboService helloDubboService;

    public String test(String param){
        return helloDubboService.helloDubbo(param);
    }
}
