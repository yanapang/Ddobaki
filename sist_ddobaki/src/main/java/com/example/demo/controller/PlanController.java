package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
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
	@GetMapping("updatePlan")
	public int updatePlan() {
		return 1;
	}
	//[다정]
}
