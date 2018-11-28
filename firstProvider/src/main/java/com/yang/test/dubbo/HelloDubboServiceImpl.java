package com.yang.test.dubbo;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2018/9/11 0011.
 */

@Service(interfaceClass = HelloDubboService.class,version = "1.0.0")
@Component
public class HelloDubboServiceImpl implements  HelloDubboService {
    @Override
    public String helloDubbo(String param) {
        return "你好客户端，我是dubbo服务端，接收到的请求消息："+param;
    }
}
