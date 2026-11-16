package com.SpringBootMVC.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages="com.SpringBootMVC")
@EnableJpaRepositories(basePackages="com.SpringBootMVC.repo")
@EntityScan(basePackages="com.SpringBootMVC.model")

public class SpringBootMvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMvcApplication.class, args);
		System.out.println("start  spring boot application");
	}

}
