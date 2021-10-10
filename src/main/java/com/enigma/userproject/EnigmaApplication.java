package com.enigma.userproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
@EntityScan(basePackages= {"com.enigma.userproject.model"})
public class EnigmaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EnigmaApplication.class, args);
	}

}
