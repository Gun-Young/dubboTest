package com.yang.test.dubbo;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubboConfiguration
@SpringBootApplication
public class FirstProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstProviderApplication.class, args);
	}
}
