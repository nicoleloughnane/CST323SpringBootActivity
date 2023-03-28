package com.gcu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@ComponentScan({"com.gcu"})
@SpringBootApplication
public class Topic44Application {

	public static void main(String[] args) {
		SpringApplication.run(Topic44Application.class, args);
		log.info("Springboot and lombok application started successfully.");
	}

}
