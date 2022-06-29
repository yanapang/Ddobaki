package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlanController {
	@GetMapping("/insertPlan")
	public int insert() {
		return 1;
	}
	@GetMapping("updatePlan")
	public String update() {
		System.out.println("다정테스트");
		return "OK";
		
	}
}

