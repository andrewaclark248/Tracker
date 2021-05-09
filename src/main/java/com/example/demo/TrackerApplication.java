package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


//@Configuration = SpringBoot
//@EnableAutoConfiguration = SpringBoot
//@SpringBootApplication
@SpringBootApplication(scanBasePackages = {"demo","controllers", "models", "repositories"})
@EnableJpaRepositories("repositories")
@EntityScan(basePackages="models")

//@ComponentScan({"demo","controllers", "models"})
//@EnableJpaRepositories("repositories")
public class TrackerApplication {


	
	//mvn clean package spring-boot:repackage
	//mvn install
	//mvn spring-boot:run
	public static void main(String[] args) {
		SpringApplication.run(TrackerApplication.class, args);
	}

}
