package com.example.serverA;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
@MapperScan({"com.example.serverA.*.mapper"})
public class ServerA {

	public static void main(String[] args) {
		SpringApplication.run(ServerA.class, args);
	}

}
