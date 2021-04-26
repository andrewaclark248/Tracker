package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Configuration
@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan({"demo","controllers"})
public class TrackerApplication {


	
	//mvn clean package spring-boot:repackage
	//mvn install
	//mvn spring-boot:run
	public static void main(String[] args) {
		SpringApplication.run(TrackerApplication.class, args);
	}

}
