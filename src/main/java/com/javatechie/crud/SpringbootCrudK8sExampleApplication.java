package com.javatechie.crud;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@RestController
@EnableAutoConfiguration
@SpringBootApplication
public class SpringbootCrudK8sExampleApplication {

	private static final Logger logger = LoggerFactory.getLogger(SpringbootCrudK8sExampleApplication.class);
	public static void main(String[] args) {
		logger.info("this is a info message");
		SpringApplication.run(SpringbootCrudK8sExampleApplication.class, args);
		logger.info("App execution completed");
	}

}
