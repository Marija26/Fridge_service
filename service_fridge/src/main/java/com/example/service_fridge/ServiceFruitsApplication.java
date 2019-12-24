package com.example.service_fridge;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableEurekaClient
@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.example.service_fridge.repository")
public class ServiceFruitsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceFruitsApplication.class, args);
	}

}

