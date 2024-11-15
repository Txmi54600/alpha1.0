package com.example.topic2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.example.topic2.model")
public class Topic2Application {
	public static void main(String[] args) {
		SpringApplication.run(Topic2Application.class, args);
	}
}
