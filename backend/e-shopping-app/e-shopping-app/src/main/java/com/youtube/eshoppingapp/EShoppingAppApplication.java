package com.youtube.eshoppingapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages ="com.youtube.eshoppingapp")
@EntityScan(basePackages="com.youtube.eshoppingapp.entity")
@EnableJpaRepositories(basePackages ="com.youtube.eshoppingapp.repository")
public class EShoppingAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(EShoppingAppApplication.class, args);
		//Add the following line 
		System.out.println("Spring Boot Application Up!");
	}

}

//Add Annotation For Enable: 