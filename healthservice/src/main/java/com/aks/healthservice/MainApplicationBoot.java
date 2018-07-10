package com.aks.healthservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@ComponentScan("com.aks.healthservice")
@EntityScan("com.aks.healthservice")
@EnableJpaRepositories("com.aks.healthservice")
@EnableAutoConfiguration
public class MainApplicationBoot {

	public static void main(String[] args) {
		SpringApplication.run(MainApplicationBoot.class, args);
	}
	
}
