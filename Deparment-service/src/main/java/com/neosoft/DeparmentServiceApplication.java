package com.neosoft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DeparmentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeparmentServiceApplication.class, args);
	}

}
