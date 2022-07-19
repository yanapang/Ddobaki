package com.example.demo;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class SistDdobakiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SistDdobakiApplication.class, args);
	}
	
	@Bean(name = "uploadPath")
	public String uploadPath() {
		return "c:/day0704/sist_ddobaki/src/main/resources/static/images/";
	}
}
	
