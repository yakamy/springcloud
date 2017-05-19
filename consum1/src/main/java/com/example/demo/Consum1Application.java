package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableDiscoveryClient  //启动服务注册与发现
@EnableFeignClients     //启用feign进行远程调用
@EnableHystrixDashboard
@EnableCircuitBreaker
public class Consum1Application {

	public static void main(String[] args) {
		SpringApplication.run(Consum1Application.class, args);
	}
}
