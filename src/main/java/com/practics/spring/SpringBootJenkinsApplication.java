package com.practics.spring;

import java.util.logging.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class SpringBootJenkinsApplication {
     public static Logger logger=(Logger) LoggerFactory.getLogger(SpringBootJenkinsApplication.class);
     @PostConstruct
     public void init() {
    	 logger.info("Application stated");
     }
     public static void main(String[] args) {
    	 logger.info("Application Excuted");
		SpringApplication.run(SpringBootJenkinsApplication.class, args);
	}

}
