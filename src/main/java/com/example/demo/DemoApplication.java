package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	// This function will start application
	public static void main(String[] args) {
		System.out.println("******** Running Demo Application ********");
		SpringApplication.run(DemoApplication.class, args);
	}

}
