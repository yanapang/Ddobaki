package com.example.demo;

import javax.persistence.EntityManager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.querydsl.jpa.impl.JPAQueryFactory;

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
	
