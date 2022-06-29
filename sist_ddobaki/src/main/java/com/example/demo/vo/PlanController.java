package com.example.demo.vo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PlanController {

	@GetMapping("insertPlan")
	public String insert() {
		return "OK";
	}
	//[다정]
}
