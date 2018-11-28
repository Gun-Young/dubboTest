package com.yang.test.dubbo;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfiguration
public class FirstConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstConsumerApplication.class, args);
	}
}
