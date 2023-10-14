package com.example.demosecuritypractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class DemoSecurityPracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSecurityPracticeApplication.class, args);
	}

}
