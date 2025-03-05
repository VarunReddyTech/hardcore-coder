package com.hardcore.coder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HardcoreCoder1Application {

	public static void main(String[] args) {
		SpringApplication.run(HardcoreCoder1Application.class, args);
	}


	@RequestMapping("/")
	public String greatCause(){
		return "I am becoming a hardcore coder with my love.";
	}
}
