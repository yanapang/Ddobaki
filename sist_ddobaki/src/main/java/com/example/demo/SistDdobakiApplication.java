package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SistDdobakiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SistDdobakiApplication.class, args);
	}
	
	@Bean(name = "uploadPath")
	public String uploadPath() {
		return "c:/day0704/ddobaki_board_3/src/main/resources/static/image/";
	}
	
	}
	
