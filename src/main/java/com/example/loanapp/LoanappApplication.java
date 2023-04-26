package com.example.loanapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class LoanappApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoanappApplication.class, args);
	}

}
