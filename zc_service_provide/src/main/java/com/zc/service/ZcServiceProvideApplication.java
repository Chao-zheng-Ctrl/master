package com.zc.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.zc.service.mapper")
@EnableDiscoveryClient //启用eureka客户端，@EnableEurekaClient
public class ZcServiceProvideApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZcServiceProvideApplication.class, args);
	}

}
