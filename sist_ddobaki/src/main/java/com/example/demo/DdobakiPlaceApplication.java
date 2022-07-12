package com.example.demo;

import javax.persistence.EntityManager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.querydsl.jpa.impl.JPAQueryFactory;

@SpringBootApplication
public class DdobakiPlaceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DdobakiPlaceApplication.class, args);
	}
	
	@Bean    
    public JPAQueryFactory jpaQueryFactory(EntityManager em) {
        return new JPAQueryFactory(em);
    }

}
