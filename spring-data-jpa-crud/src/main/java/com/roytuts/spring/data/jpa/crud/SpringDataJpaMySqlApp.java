package com.roytuts.spring.data.jpa.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.roytuts.spring.data.jpa.crud.entity")
public class SpringDataJpaMySqlApp {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaMySqlApp.class, args);
	}

}
