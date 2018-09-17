package com.microservice.forex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class MircoserviceForexServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MircoserviceForexServiceApplication.class, args);
	}
}
