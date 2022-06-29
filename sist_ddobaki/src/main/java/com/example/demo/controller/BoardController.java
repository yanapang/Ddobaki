package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoardController {

	public int insert() {
		System.out.println("우리모두깃완전정복");
		return 1;	
	}
	
	public String bang() {
		return "충돌!";
	}
	
}
