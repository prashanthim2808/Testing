package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Day1App1Sb11Application {

	public static void main(String[] args) {
		SpringApplication.run(Day1App1Sb11Application.class, args);
	}
	@GetMapping("/msg")
	public String getDetails() {
		return "Hello spring boot";
		}

}
