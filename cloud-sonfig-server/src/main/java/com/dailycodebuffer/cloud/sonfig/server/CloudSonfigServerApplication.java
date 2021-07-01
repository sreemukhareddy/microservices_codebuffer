package com.dailycodebuffer.cloud.sonfig.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
public class CloudSonfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudSonfigServerApplication.class, args);
	}

}
