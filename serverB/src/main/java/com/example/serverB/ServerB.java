package com.example.serverB;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
@MapperScan({"com.example.serverB.*.mapper"})
public class ServerB {

	public static void main(String[] args) {
		SpringApplication.run(ServerB.class, args);
	}

}
