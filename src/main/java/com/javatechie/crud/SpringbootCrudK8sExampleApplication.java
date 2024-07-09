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
		logger.info("app execution started : "+args);
		logger.debug("this is a info message");
		logger.debug("app execution started : "+args);
		SpringApplication.run(SpringbootCrudK8sExampleApplication.class, args);
		logger.debug("this is from debug after calling run() : "+args);
		logger.debug("app execution started from debug after calling run()  : "+args);
		logger.info("after calling run() : "+args)
		logger.info("App execution completed");
	}

}
