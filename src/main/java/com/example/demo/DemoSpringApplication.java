package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringApplication.class, args);
	}
	@Bean
	CommandLineRunner commandLineRunner(jpaRepository jpaRepository){
		return args -> {
			Student maria=new Student("maria",
					"jones",
					"maria.jones@gmail.com",
					21);
			jpaRepository.save(maria);
		};
	}

}
