package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoardController {
	public int insert() {	
		return 1;
		
	}
	
	public String bang() {
		return "충돌!";
	}
}
