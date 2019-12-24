package com.example.service_fruit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ServiceFruitApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceFruitApplication.class, args);
	}

}
